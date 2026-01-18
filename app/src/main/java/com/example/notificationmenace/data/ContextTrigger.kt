package com.example.notificationmenace.data

enum class ContextTrigger(val tag: String) {
    // Battery
    BATTERY_LOW("battery_low"),
    BATTERY_OKAY("battery_okay"),
    BATTERY_CHARGING("battery_charging"),
    BATTERY_UNPLUGGED("battery_unplugged"),
    
    // Connectivity
    WIFI_CONNECTED("wifi_connected"),
    WIFI_DISCONNECTED("wifi_disconnected"),
    
    // Screen
    SCREEN_UNLOCK("screen_unlock"),
    SCREEN_ON("screen_on"),
    
    // Audio
    HEADPHONES_PLUGGED("headphones_plugged"),
    HEADPHONES_UNPLUGGED("headphones_unplugged"),
    
    // Mode
    AIRPLANE_MODE_ON("airplane_mode_on"),
    AIRPLANE_MODE_OFF("airplane_mode_off"),
    
    // System
    BOOT_COMPLETED("boot_completed"),
    
    // Time-based
    NIGHT_OWL("night_owl"),
    DOOMSCROLLING("doomscrolling"),

    // Ongoing
    ONGOING("ongoing"),
    
    // Default
    GENERAL("general");

    companion object {
        fun fromTag(tag: String): ContextTrigger {
            return entries.find { it.tag == tag } ?: GENERAL
        }
    }
}
