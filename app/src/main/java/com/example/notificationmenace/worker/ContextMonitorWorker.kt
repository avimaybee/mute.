package com.example.notificationmenace.worker

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.BatteryManager
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.example.notificationmenace.data.ContextTrigger
import com.example.notificationmenace.data.PrankRepository
import com.example.notificationmenace.util.NotificationManagerHelper

class ContextMonitorWorker(
    appContext: Context,
    workerParams: WorkerParameters
) : CoroutineWorker(appContext, workerParams) {

    private val notificationHelper = NotificationManagerHelper(appContext)

    override suspend fun doWork(): Result {
        val detectedTriggers = mutableListOf<ContextTrigger>()
        val repository = PrankRepository

        // Check Battery
        val batteryStatus: Intent? = applicationContext.registerReceiver(null, IntentFilter(Intent.ACTION_BATTERY_CHANGED))
        val level: Int = batteryStatus?.getIntExtra(BatteryManager.EXTRA_LEVEL, -1) ?: -1
        val scale: Int = batteryStatus?.getIntExtra(BatteryManager.EXTRA_SCALE, -1) ?: -1
        val batteryPct = if (scale > 0) level * 100 / scale.toFloat() else 100f

        if (batteryPct <= 15f && batteryPct > 0f) {
            detectedTriggers.add(ContextTrigger.BATTERY_LOW)
        }

        val status: Int = batteryStatus?.getIntExtra(BatteryManager.EXTRA_STATUS, -1) ?: -1
        val isCharging: Boolean = status == BatteryManager.BATTERY_STATUS_CHARGING ||
                status == BatteryManager.BATTERY_STATUS_FULL

        if (isCharging) {
            detectedTriggers.add(ContextTrigger.BATTERY_CHARGING)
        }

        // Check Connectivity
        val connectivityManager = applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val network = connectivityManager.activeNetwork
        val capabilities = connectivityManager.getNetworkCapabilities(network)
        
        if (capabilities == null) {
             detectedTriggers.add(ContextTrigger.WIFI_DISCONNECTED) // No network
        } else if (!capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
             detectedTriggers.add(ContextTrigger.WIFI_DISCONNECTED) // Not on WiFi (Data or other)
        }

        // Select highest priority trigger
        val selectedTrigger = when {
            detectedTriggers.contains(ContextTrigger.BATTERY_LOW) -> ContextTrigger.BATTERY_LOW
            detectedTriggers.contains(ContextTrigger.BATTERY_CHARGING) -> ContextTrigger.BATTERY_CHARGING
            detectedTriggers.contains(ContextTrigger.WIFI_DISCONNECTED) -> ContextTrigger.WIFI_DISCONNECTED
            else -> ContextTrigger.GENERAL
        }

        val prank = repository.getPrankForTrigger(selectedTrigger)
        
        // Simple logic: 10% chance to fire to avoid spamming every 15 mins (for now)
        // AND always fire if it's a specific trigger (not GENERAL) to verify implementation
        if (selectedTrigger != ContextTrigger.GENERAL || Math.random() < 0.1) {
            notificationHelper.showNotification(prank)
        }

        return Result.success()
    }
}