package com.example.notificationmenace.worker

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.example.notificationmenace.data.ContextTrigger
import com.example.notificationmenace.data.Prank
import com.example.notificationmenace.data.PrankRepository
import com.example.notificationmenace.data.PrankType
import com.example.notificationmenace.data.RemotePrank
import com.example.notificationmenace.data.RemotePrankResponse
import com.example.notificationmenace.util.LogManager
import com.example.notificationmenace.util.NotificationManagerHelper
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.net.URL

class ContentSyncWorker(
    appContext: Context,
    workerParams: WorkerParameters
) : CoroutineWorker(appContext, workerParams) {

    companion object {
        private const val TAG = "ContentSyncWorker"
        
        // User's raw Gist URL for remote content (JSON Array format)
        const val GIST_URL = "https://gist.githubusercontent.com/avimaybee/523a2addcb050d4b225780366a6b903d/raw/pranks.json"
    }

    private val repository = PrankRepository
    private val gson = Gson()

    override suspend fun doWork(): Result {
        LogManager.log("SYNC WORKER STARTING...")
        return withContext(Dispatchers.IO) {
            try {
                // Fetch from Gist
                val url = URL(GIST_URL)
                val json = url.readText()
                LogManager.log("FETCHED ${json.length} BYTES FROM GIST")
                
                // Parse as RemotePrankResponse object (checking for version/metadata wrapper)
                val response = gson.fromJson(json, RemotePrankResponse::class.java)
                val remotePranks = response.pranks
                LogManager.log("PARSED ${remotePranks.size} PRANKS FROM GIST (v${response.version})")
                
                // Convert to Prank objects
                val newPranks = remotePranks.map { it.toPrank() }
                
                // Get existing IDs
                val existingIds = repository.getAllPranks().map { it.id }.toSet()
                val uniqueNewPranks = newPranks.filter { !existingIds.contains(it.id) }

                if (uniqueNewPranks.isNotEmpty()) {
                    repository.addPranks(uniqueNewPranks)
                    LogManager.log("SYNCED ${uniqueNewPranks.size} NEW PRANKS.")
                    
                    // Check for URGENCY pranks and trigger immediately
                    uniqueNewPranks.forEach { prank ->
                        if (prank.type == PrankType.URGENCY) {
                            LogManager.log("URGENCY PRANK DETECTED: ${prank.senderName}")
                            showImmediateNotification(prank)
                        }
                    }
                } else {
                    LogManager.log("ALL ${remotePranks.size} PRANKS ALREADY EXIST.")
                }

                LogManager.log("SYNC COMPLETE. TOTAL PRANKS: ${repository.getPrankCount()}")
                Result.success()

            } catch (e: Exception) {
                LogManager.log("SYNC FAILED: ${e.message}")
                e.printStackTrace()
                Result.retry()
            }
        }
    }
    
    private fun showImmediateNotification(prank: Prank) {
        val notificationHelper = NotificationManagerHelper(applicationContext)
        notificationHelper.showNotification(prank)
    }
}

