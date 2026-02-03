package com.example.notificationmenace.util

import android.content.Context
import android.content.SharedPreferences
import com.example.notificationmenace.data.ContextTrigger

/**
 * Prevents notification spam by tracking last prank times per trigger category.
 */
class CooldownManager(context: Context) {
    
    companion object {
        private const val PREFS_NAME = "mute_cooldowns"
        private const val DEFAULT_COOLDOWN_MS = 10 * 60 * 1000L  // 10 minutes
        
        // Different cooldowns for different triggers
        private val COOLDOWN_MAP = mapOf(
            ContextTrigger.GENERAL to 30 * 60 * 1000L,         // 30 min for random
            ContextTrigger.SCREEN_UNLOCK to 60 * 60 * 1000L,   // 1 hour for unlocks
            ContextTrigger.SCREEN_ON to 120 * 60 * 1000L,      // 2 hours for screen on
            ContextTrigger.BATTERY_LOW to 15 * 60 * 1000L,     // 15 min
            ContextTrigger.BATTERY_CHARGING to 5 * 60 * 1000L, // 5 min (one per charge)
            ContextTrigger.BATTERY_UNPLUGGED to 5 * 60 * 1000L,// 5 min
            ContextTrigger.HEADPHONES_PLUGGED to 10 * 60 * 1000L,
            ContextTrigger.HEADPHONES_UNPLUGGED to 10 * 60 * 1000L,
            ContextTrigger.AIRPLANE_MODE_ON to 5 * 60 * 1000L,
            ContextTrigger.AIRPLANE_MODE_OFF to 5 * 60 * 1000L,
            ContextTrigger.WIFI_CONNECTED to 4 * 60 * 60 * 1000L,   // 4 hours
            ContextTrigger.WIFI_DISCONNECTED to 4 * 60 * 60 * 1000L,// 4 hours
            ContextTrigger.BOOT_COMPLETED to 0L,               // Always show on boot
            ContextTrigger.ONGOING to 0L,                      // No cooldown for ongoing/forced pranks
            ContextTrigger.NIGHT_OWL to 60 * 60 * 1000L,       // 1 hour
            ContextTrigger.DOOMSCROLLING to 45 * 60 * 1000L,   // 45 min
            ContextTrigger.BATTERY_OKAY to 10 * 60 * 1000L     // 10 min
        )
    }
    
    private val prefs: SharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    
    /**
     * Returns true if enough time has passed since last prank for this trigger.
     */
    fun canPrank(trigger: ContextTrigger): Boolean {
        val key = getCoalescingKey(trigger)
        val lastPrankTime = prefs.getLong(key, 0L)
        val cooldownMs = COOLDOWN_MAP[trigger] ?: DEFAULT_COOLDOWN_MS
        
        return System.currentTimeMillis() - lastPrankTime >= cooldownMs
    }
    
    /**
     * Records that a prank was just shown for this trigger.
     */
    fun recordPrank(trigger: ContextTrigger) {
        val key = getCoalescingKey(trigger)
        prefs.edit()
            .putLong(key, System.currentTimeMillis())
            .apply()
    }
    
    /**
     * Clears all cooldown history.
     */
    fun clearAll() {
        prefs.edit().clear().apply()
    }
    
    /**
     * Gets remaining cooldown time in seconds (for debug purposes).
     */
    fun getRemainingCooldown(trigger: ContextTrigger): Long {
        val key = getCoalescingKey(trigger)
        val lastPrankTime = prefs.getLong(key, 0L)
        val cooldownMs = COOLDOWN_MAP[trigger] ?: DEFAULT_COOLDOWN_MS
        val remaining = cooldownMs - (System.currentTimeMillis() - lastPrankTime)
        
        return if (remaining > 0) remaining / 1000 else 0
    }

    /**
     * Maps triggers to shared keys if they should share a cooldown (e.g. Network events).
     */
    private fun getCoalescingKey(trigger: ContextTrigger): String {
        return when (trigger) {
            ContextTrigger.WIFI_CONNECTED,
            ContextTrigger.WIFI_DISCONNECTED,
            ContextTrigger.AIRPLANE_MODE_ON,
            ContextTrigger.AIRPLANE_MODE_OFF -> "shared_network_event"
            else -> trigger.tag
        }
    }
}
