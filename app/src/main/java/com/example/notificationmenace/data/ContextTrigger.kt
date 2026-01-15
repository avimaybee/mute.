package com.example.notificationmenace.data

enum class ContextTrigger(val tag: String) {
    BATTERY_LOW("battery_low"),
    BATTERY_CHARGING("battery_charging"),
    WIFI_DISCONNECTED("wifi_disconnected"),
    SCREEN_UNLOCK("screen_unlock"),
    DOOMSCROLLING("doomscrolling"),
    GENERAL("general"); // Default for random pranks

    companion object {
        fun fromTag(tag: String): ContextTrigger {
            return entries.find { it.tag == tag } ?: GENERAL
        }
    }
}
