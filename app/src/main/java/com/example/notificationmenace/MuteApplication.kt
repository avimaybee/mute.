package com.example.notificationmenace

import android.app.Application
import android.content.Intent
import android.content.IntentFilter
import com.example.notificationmenace.receiver.ContextReceiver

class MuteApplication : Application() {

    private val contextReceiver = ContextReceiver()

    override fun onCreate() {
        super.onCreate()
        
        val filter = IntentFilter().apply {
            addAction(Intent.ACTION_USER_PRESENT)
            addAction(Intent.ACTION_POWER_CONNECTED)
            addAction(Intent.ACTION_POWER_DISCONNECTED)
        }
        registerReceiver(contextReceiver, filter)
    }
}
