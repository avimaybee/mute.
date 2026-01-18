package com.example.notificationmenace.util

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

import android.content.Context
import java.io.File

object LogManager {

    private val _logs = MutableLiveData<String>()
    val logs: LiveData<String> = _logs

    private val logBuffer = StringBuilder()
    private val dateFormat = SimpleDateFormat("HH:mm:ss", Locale.US)
    private var logFile: File? = null
    private var isInitialized = false

    /**
     * Initialize the LogManager. This is idempotent - calling it multiple times
     * is safe and will only initialize once.
     */
    fun init(context: Context) {
        if (isInitialized) return
        isInitialized = true
        
        logFile = File(context.filesDir, "system_log.txt")
        if (logFile?.exists() == true) {
            try {
                val content = logFile?.readText() ?: ""
                if (content.isNotBlank()) {
                    logBuffer.append(content)
                    _logs.postValue(content)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        // Always add a startup entry so the log is never empty
        log("=== MUTE SESSION STARTED ===", saveToFile = true)
    }

    /**
     * Log a message with optional file persistence.
     * @param message The message to log
     * @param saveToFile Whether to persist the message to disk (default: true)
     */
    fun log(message: String, saveToFile: Boolean = true) {
        val timestamp = dateFormat.format(Date())
        val formattedMessage = "> $timestamp: $message\n"
        
        logBuffer.append(formattedMessage)
        
        // Keep buffer size manageable
        if (logBuffer.length > 10000) {
            logBuffer.delete(0, 2000)
        }
        
        _logs.postValue(logBuffer.toString())
        
        if (saveToFile) {
            try {
                logFile?.appendText(formattedMessage)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun clear() {
        logBuffer.setLength(0)
        _logs.postValue("")
        try {
            logFile?.writeText("")
        } catch (e: Exception) {
            e.printStackTrace()
        }
        
        // Add header
        log("SYSTEM LOG PURGED", saveToFile = true)
    }
}
