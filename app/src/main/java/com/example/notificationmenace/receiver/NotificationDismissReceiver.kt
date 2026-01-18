package com.example.notificationmenace.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.notificationmenace.util.LogManager

class NotificationDismissReceiver : BroadcastReceiver() {
    companion object {
        const val EXTRA_SENDER_NAME = "sender_name"
    }

    override fun onReceive(context: Context, intent: Intent?) {
        val sender = intent?.getStringExtra(EXTRA_SENDER_NAME) ?: "Unknown"
        // Since LogManager is a singleton, we can just call it.
        // But we need to make sure it's initialized. 
        // MuteApplication should have initialized it, but if app was killed and receiver starts process...
        // MuteApplication.onCreate() runs first. So safe.
        
        LogManager.init(context) // Re-init just in case, it's idempotent-ish (reads file again if not init? No, check code)
        // My LogManager implementation checks "if (logFile?.exists() == true)". 
        // Better: ensure init is safe.
        
        LogManager.log("NOTIFICATION IGNORED: User dismissed message from [$sender]")
    }
}
