package com.example.notificationmenace.util

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.notificationmenace.R
import com.example.notificationmenace.data.Prank
import com.example.notificationmenace.data.PrankType
import com.example.notificationmenace.data.ContextTrigger
import com.example.notificationmenace.ui.GotchaActivity
import com.example.notificationmenace.receiver.NotificationDismissReceiver

class NotificationManagerHelper(private val context: Context) {

    companion object {
        const val CHANNEL_ID = "mute_pranks_channel"
        const val CHANNEL_NAME = "Mute Pranks"
        const val EXTRA_PRANK_ID = "extra_prank_id"
    }

    init {
        createNotificationChannel()
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, CHANNEL_NAME, importance).apply {
                description = "Prank notifications from Mute"
            }
            val notificationManager: NotificationManager =
                context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    fun showNotification(prank: Prank) {
        // Check POST_NOTIFICATIONS permission on Android 13+
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (context.checkSelfPermission(android.Manifest.permission.POST_NOTIFICATIONS) 
                != android.content.pm.PackageManager.PERMISSION_GRANTED) {
                LogManager.log("BLOCKED: NOTIFICATION PERMISSION DENIED")
                return
            }
        }

        val prefs = context.getSharedPreferences("mute_prefs", Context.MODE_PRIVATE)
        if (!prefs.getBoolean("protocol_active", true)) {
            com.example.notificationmenace.util.LogManager.log("BLOCKED: SYSTEM DISARMED")
            return
        }

        val intent = Intent(context, GotchaActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            putExtra(EXTRA_PRANK_ID, prank.id)
        }
        
        val pendingIntent: PendingIntent = PendingIntent.getActivity(
            context, 
            prank.id, 
            intent, 
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        // Create Dismiss Intent
        val dismissIntent = Intent(context, NotificationDismissReceiver::class.java).apply {
            action = "com.example.notificationmenace.ACTION_DISMISS"
            putExtra(NotificationDismissReceiver.EXTRA_SENDER_NAME, prank.senderName)
        }
        
        val deletePendingIntent: PendingIntent = PendingIntent.getBroadcast(
            context,
            prank.id * 100, // Unique ID to avoid conflicts
            dismissIntent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        val isOngoing = prank.tags.contains(ContextTrigger.ONGOING)

        // Build title: Only include sender for persona-based pranks that need context
        // Generic senders (Mute, Your Phone, System, Alert, etc.) don't add value
        val genericSenders = listOf(
            "mute", "mute app", "your phone", "phone", "system", "alert", 
            "notification", "warning", "error", "update", "reminder",
            "screen time", "storage", "productivity", "brainrot", "fortune",
            "horoscope", "oracle", "prediction", "vibe check", "aura check",
            "security", "network"
        )
        
        val notificationTitle = if (genericSenders.any { prank.senderName.equals(it, ignoreCase = true) }) {
            prank.messageBody
        } else {
            // Persona-based sender (FBI, Bank, Mom, Crush, etc.) - include for context
            "${prank.senderName}: ${prank.messageBody}"
        }

        val builder = NotificationCompat.Builder(context, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_logo_monochrome)
            .setContentTitle(notificationTitle)
            .setContentText(prank.punchlineText)
            .setStyle(NotificationCompat.BigTextStyle()
                .bigText(prank.punchlineText)) // Only punchline in expanded view
            .setPriority(if (prank.type == PrankType.URGENCY) NotificationCompat.PRIORITY_HIGH else NotificationCompat.PRIORITY_DEFAULT)
            .setContentIntent(pendingIntent)
            .setDeleteIntent(deletePendingIntent)
            .setAutoCancel(!isOngoing)
            .setOngoing(isOngoing)

        with(NotificationManagerCompat.from(context)) {
            notify(prank.id, builder.build())
        }
        
        com.example.notificationmenace.util.LogManager.log("NOTIFICATION DISPATCHED: [${prank.senderName}] ${prank.messageBody}")
    }
}

