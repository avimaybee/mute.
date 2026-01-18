package com.example.notificationmenace.util

import android.content.Context
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.workDataOf
import com.example.notificationmenace.worker.PrankWorker
import java.util.concurrent.TimeUnit

class Scheduler(private val context: Context) {

    fun scheduleImmediatePrank(triggerTag: String, bypassCooldown: Boolean = false) {
        val data = workDataOf(
            "trigger_tag" to triggerTag,
            "bypass_cooldown" to bypassCooldown
        )
        val workRequest = OneTimeWorkRequestBuilder<PrankWorker>()
            .setInputData(data)
            .build()
        WorkManager.getInstance(context).enqueue(workRequest)
    }

    fun schedulePranks(frequencyPerDay: Float) {
        if (frequencyPerDay <= 0f) {
            cancelAll()
            return
        }

        // Calculate interval in minutes
        val intervalMinutes = (24 * 60 / frequencyPerDay).toLong()
        
        val workRequest = PeriodicWorkRequestBuilder<PrankWorker>(
            intervalMinutes, TimeUnit.MINUTES,
            15, TimeUnit.MINUTES // flex interval
        ).build()

        WorkManager.getInstance(context).enqueueUniquePeriodicWork(
            "prank_work",
            ExistingPeriodicWorkPolicy.UPDATE,
            workRequest
        )
    }

    fun cancelAll() {
        WorkManager.getInstance(context).cancelUniqueWork("prank_work")
    }
}
