package com.example.notificationmenace.util

import android.content.Context
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.example.notificationmenace.worker.PrankWorker
import java.util.concurrent.TimeUnit

class Scheduler(private val context: Context) {

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
