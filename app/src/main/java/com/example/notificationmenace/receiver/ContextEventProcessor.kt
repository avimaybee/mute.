package com.example.notificationmenace.receiver

class ContextEventProcessor(
    private val onTrigger: (String) -> Unit
) {
    fun process(action: String?) {
        when (action) {
            "android.intent.action.USER_PRESENT" -> onTrigger("trigger_unlock")
            "android.intent.action.ACTION_POWER_CONNECTED" -> onTrigger("trigger_power_connected")
            "android.intent.action.ACTION_POWER_DISCONNECTED" -> onTrigger("trigger_power_disconnected")
        }
    }
}
