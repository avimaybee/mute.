package com.example.notificationmenace.worker

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.example.notificationmenace.data.Prank
import com.example.notificationmenace.data.PrankRepository
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.net.URL

class ContentSyncWorker(
    appContext: Context,
    workerParams: WorkerParameters
) : CoroutineWorker(appContext, workerParams) {

    private val repository = PrankRepository

    override suspend fun doWork(): Result {
        return try {
            // Placeholder URL for remote content - in a real scenario this would be a Firebase/GitHub URL
            val jsonString = URL("https://raw.githubusercontent.com/example/mute-content/main/pranks.json").readText()
            
            val prankListType = object : TypeToken<List<Prank>>() {}.type
            val newPranks: List<Prank> = Gson().fromJson(jsonString, prankListType)
            
            repository.addPranks(newPranks)
            
            Result.success()
        } catch (e: Exception) {
            // In a real app, we'd log this and maybe retry if it's a transient network issue
            Result.retry()
        }
    }
}
