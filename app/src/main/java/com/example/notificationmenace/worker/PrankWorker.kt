package com.example.notificationmenace.worker

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.example.notificationmenace.data.PrankRepository
import com.example.notificationmenace.util.NotificationManagerHelper

class PrankWorker(
    appContext: Context,
    workerParams: WorkerParameters
) : CoroutineWorker(appContext, workerParams) {

    private val repository = PrankRepository()
    private val notificationHelper = NotificationManagerHelper(appContext)

    override suspend fun doWork(): Result {
        val prank = repository.getRandomPrank()
        
        notificationHelper.showNotification(prank)
        
        // TODO: Schedule the next prank based on settings
        
        return Result.success()
    }
}