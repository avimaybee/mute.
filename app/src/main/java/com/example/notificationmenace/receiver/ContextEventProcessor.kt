package com.example.notificationmenace.receiver

import android.content.Intent
import android.os.Bundle

class ContextEventProcessor(
    private val onTrigger: (String) -> Unit
) {
    fun process(action: String?, extras: Bundle? = null) {
        when (action) {
            // Screen
            Intent.ACTION_USER_PRESENT -> onTrigger("screen_unlock")
            Intent.ACTION_SCREEN_ON -> onTrigger("screen_on")
            
            // Power
            Intent.ACTION_POWER_CONNECTED -> onTrigger("battery_charging")
            Intent.ACTION_POWER_DISCONNECTED -> onTrigger("battery_unplugged")
            Intent.ACTION_BATTERY_LOW -> onTrigger("battery_low")
            Intent.ACTION_BATTERY_OKAY -> onTrigger("battery_okay")
            
            // Headphones
            Intent.ACTION_HEADSET_PLUG -> {
                val state = extras?.getInt("state", -1) ?: -1
                when (state) {
                    1 -> onTrigger("headphones_plugged")
                    0 -> onTrigger("headphones_unplugged")
                }
            }
            
            // Airplane Mode
            Intent.ACTION_AIRPLANE_MODE_CHANGED -> {
                val isOn = extras?.getBoolean("state", false) ?: false
                if (isOn) onTrigger("airplane_mode_on")
                else onTrigger("airplane_mode_off")
            }
            
            // Boot
            Intent.ACTION_BOOT_COMPLETED -> onTrigger("boot_completed")
        }
    }
}
