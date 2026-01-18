package com.example.notificationmenace.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.example.notificationmenace.util.LogManager
import com.example.notificationmenace.util.Scheduler
import com.example.notificationmenace.worker.ContextMonitorWorker
import java.util.concurrent.TimeUnit

class ContextReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent?) {
        if (intent == null) return

        // On boot or app update, reschedule workers
        if (intent.action == Intent.ACTION_BOOT_COMPLETED || 
            intent.action == Intent.ACTION_MY_PACKAGE_REPLACED) {
            LogManager.init(context)
            LogManager.log("BOOT DETECTED - RESCHEDULING WORKERS")
            rescheduleWorkers(context)
            
            // Send a boot prank
            Scheduler(context).scheduleImmediatePrank("boot_completed", bypassCooldown = true)
            return
        }

        // Handle other events normally
        val scheduler = Scheduler(context)
        val processor = ContextEventProcessor { tag ->
            scheduler.scheduleImmediatePrank(tag)
        }
        
        processor.process(intent.action, intent.extras)
    }

    private fun rescheduleWorkers(context: Context) {
        val monitorRequest = PeriodicWorkRequestBuilder<ContextMonitorWorker>(
            15, TimeUnit.MINUTES
        ).build()

        WorkManager.getInstance(context).enqueueUniquePeriodicWork(
            "context_monitor",
            ExistingPeriodicWorkPolicy.UPDATE,
            monitorRequest
        )
    }
}
