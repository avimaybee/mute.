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
import com.example.notificationmenace.ui.GotchaActivity

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

        val builder = NotificationCompat.Builder(context, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_launcher_foreground) // Placeholder logo
            .setContentTitle(prank.senderName)
            .setContentText(prank.messageBody)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)

        with(NotificationManagerCompat.from(context)) {
            notify(prank.id, builder.build())
        }
    }
}
