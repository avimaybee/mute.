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
import com.example.notificationmenace.util.CooldownManager
import com.example.notificationmenace.util.NightOwlChecker
import com.example.notificationmenace.util.NotificationManagerHelper

class ContextMonitorWorker(
    appContext: Context,
    workerParams: WorkerParameters
) : CoroutineWorker(appContext, workerParams) {

    private val notificationHelper = NotificationManagerHelper(appContext)
    private val cooldownManager = CooldownManager(appContext)

    override suspend fun doWork(): Result {
        val repository = PrankRepository
        
        // Priority order for triggers
        val selectedTrigger = detectHighestPriorityTrigger()
        
        // Check cooldown
        if (!cooldownManager.canPrank(selectedTrigger)) {
            return Result.success()
        }

        val prank = repository.getPrankForTrigger(selectedTrigger)
        
        if (prank == null) {
             // Exhausted
             return Result.success()
        }
        
        // For GENERAL trigger, use probability to avoid spam
        if (selectedTrigger == ContextTrigger.GENERAL) {
            if (Math.random() < 0.1) { // 10% chance
                notificationHelper.showNotification(prank)
                cooldownManager.recordPrank(selectedTrigger)
            }
        } else {
            notificationHelper.showNotification(prank)
            cooldownManager.recordPrank(selectedTrigger)
        }

        return Result.success()
    }
    
    private fun detectHighestPriorityTrigger(): ContextTrigger {
        // Check Night Owl first (highest priority for time-based)
        if (NightOwlChecker.isNightOwlTime()) {
            return ContextTrigger.NIGHT_OWL
        }
        
        // Check Battery
        val batteryStatus: Intent? = applicationContext.registerReceiver(
            null, 
            IntentFilter(Intent.ACTION_BATTERY_CHANGED)
        )
        
        val level: Int = batteryStatus?.getIntExtra(BatteryManager.EXTRA_LEVEL, -1) ?: -1
        val scale: Int = batteryStatus?.getIntExtra(BatteryManager.EXTRA_SCALE, -1) ?: -1
        val batteryPct = if (scale > 0) level * 100 / scale.toFloat() else 100f

        if (batteryPct <= 15f && batteryPct > 0f) {
            return ContextTrigger.BATTERY_LOW
        }

        val status: Int = batteryStatus?.getIntExtra(BatteryManager.EXTRA_STATUS, -1) ?: -1
        val isCharging: Boolean = status == BatteryManager.BATTERY_STATUS_CHARGING ||
                status == BatteryManager.BATTERY_STATUS_FULL

        if (isCharging) {
            return ContextTrigger.BATTERY_CHARGING
        }

        // Check Connectivity
        val connectivityManager = applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val network = connectivityManager.activeNetwork
        val capabilities = connectivityManager.getNetworkCapabilities(network)
        
        if (capabilities == null) {
             if (cooldownManager.canPrank(ContextTrigger.WIFI_DISCONNECTED)) {
                 return ContextTrigger.WIFI_DISCONNECTED
             }
        } else if (!capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
             if (cooldownManager.canPrank(ContextTrigger.WIFI_DISCONNECTED)) {
                 return ContextTrigger.WIFI_DISCONNECTED
             }
        }
        
        return ContextTrigger.GENERAL
    }
}