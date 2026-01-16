package com.example.notificationmenace.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.notificationmenace.util.Scheduler

class ContextReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent?) {
        if (intent == null) return

        val scheduler = Scheduler(context)
        val processor = ContextEventProcessor { tag ->
            scheduler.scheduleImmediatePrank(tag)
        }
        
        processor.process(intent.action)
    }
}
