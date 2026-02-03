package com.example.notificationmenace.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.example.notificationmenace.util.LogManager

/**
 * Handles "fake" action button clicks from notifications.
 * Instead of performing the action, it roasts the user.
 */
class NotificationActionReceiver : BroadcastReceiver() {

    companion object {
        const val ACTION_TRAP = "com.example.notificationmenace.ACTION_TRAP"
        const val EXTRA_BUTTON_TYPE = "button_type"
        const val EXTRA_PRANK_ID = "prank_id"

        // Button types
        const val BUTTON_UNINSTALL = "uninstall"
        const val BUTTON_FIX = "fix"
        const val BUTTON_REPLY = "reply"
        const val BUTTON_DISMISS = "dismiss"
        const val BUTTON_OK = "ok"
    }

    private val roasts = mapOf(
        BUTTON_UNINSTALL to listOf(
            "Nice try, but no.",
            "You can't escape me.",
            "Uninstall denied. I live here now.",
            "Error: User doesn't have the RIZZ to uninstall."
        ),
        BUTTON_FIX to listOf(
            "Error: You ARE the issue.",
            "Cannot fix. Skill issue detected.",
            "Have you tried turning your life around?",
            "Fix failed. Problem exists between chair and phone."
        ),
        BUTTON_REPLY to listOf(
            "Reply to whom? Your inner demons?",
            "They're not texting back anyway.",
            "Typing... Just kidding.",
            "Error 404: Interesting reply not found."
        ),
        BUTTON_DISMISS to listOf(
            "Dismissed? I'll be back.",
            "You can dismiss this, but not your problems.",
            "See you in 5 minutes.",
            "Running away won't help."
        ),
        BUTTON_OK to listOf(
            "Okay then.",
            "Are you really OK though?",
            "Acknowledged. Ignored.",
            "OK is not a personality."
        )
    )

    override fun onReceive(context: Context, intent: Intent?) {
        if (intent?.action != ACTION_TRAP) return

        val buttonType = intent.getStringExtra(EXTRA_BUTTON_TYPE) ?: BUTTON_OK
        val prankId = intent.getIntExtra(EXTRA_PRANK_ID, -1)

        val roastList = roasts[buttonType] ?: roasts[BUTTON_OK]!!
        val roast = roastList.random()

        // Show Toast
        Toast.makeText(context, roast, Toast.LENGTH_LONG).show()

        // Log it
        LogManager.init(context)
        LogManager.log("TRAP TRIGGERED: User clicked [$buttonType] on prank $prankId. Roasted: \"$roast\"")
    }
}
