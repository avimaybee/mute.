package com.example.notificationmenace.util

import java.util.Calendar

/**
 * Checks if current time is in "Night Owl" hours (11pm - 5am).
 * Used to deliver sleep-shaming pranks.
 */
object NightOwlChecker {
    
    private const val NIGHT_START_HOUR = 23  // 11 PM
    private const val NIGHT_END_HOUR = 5     // 5 AM

    fun isNightOwlTime(): Boolean {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        
        return hour >= NIGHT_START_HOUR || hour < NIGHT_END_HOUR
    }

    fun getTimeDescription(): String {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        
        return when {
            hour == 0 || hour == 12 -> "midnight"
            hour in 1..4 -> "the witching hours"
            hour == 23 -> "almost midnight"
            else -> "late"
        }
    }
}
