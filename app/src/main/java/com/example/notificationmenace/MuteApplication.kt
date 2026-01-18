package com.example.notificationmenace

import android.app.Application
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest
import android.os.Build
import androidx.work.Constraints
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.NetworkType
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.example.notificationmenace.data.PrankRepository
import com.example.notificationmenace.receiver.ContextReceiver
import com.example.notificationmenace.util.LogManager
import com.example.notificationmenace.util.Scheduler
import com.example.notificationmenace.worker.ContentSyncWorker
import com.example.notificationmenace.worker.ContextMonitorWorker
import java.util.concurrent.TimeUnit

class MuteApplication : Application() {

    private val contextReceiver = ContextReceiver()
    private lateinit var connectivityManager: ConnectivityManager
    private var wasOnWifi = false

    override fun onCreate() {
        super.onCreate()
        
        LogManager.init(this)
        PrankRepository.init(this)
        LogManager.log("SYSTEM INITIALIZED - ${PrankRepository.getPrankCount()} PRANKS LOADED")
        
        // Register dynamic receivers for instant detection WHILE app is in memory
        registerDynamicReceivers()
        registerNetworkCallback()
        
        // Schedule background workers for when app is killed
        scheduleContentSync()
        scheduleContextMonitor()
    }

    /**
     * Register dynamic broadcast receivers for instant event detection.
     * These work while the app process is alive.
     */
    private fun registerDynamicReceivers() {
        val filter = IntentFilter().apply {
            addAction(Intent.ACTION_USER_PRESENT)
            addAction(Intent.ACTION_SCREEN_ON)
            addAction(Intent.ACTION_POWER_CONNECTED)
            addAction(Intent.ACTION_POWER_DISCONNECTED)
            addAction(Intent.ACTION_BATTERY_LOW)
            addAction(Intent.ACTION_BATTERY_OKAY)
            addAction(Intent.ACTION_HEADSET_PLUG)
            addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        }
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            registerReceiver(contextReceiver, filter, RECEIVER_NOT_EXPORTED)
        } else {
            registerReceiver(contextReceiver, filter)
        }
    }

    /**
     * Register network callback for WiFi connect/disconnect detection.
     */
    private fun registerNetworkCallback() {
        connectivityManager = getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
        
        val network = connectivityManager.activeNetwork
        val capabilities = connectivityManager.getNetworkCapabilities(network)
        wasOnWifi = capabilities?.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) == true

        val networkRequest = NetworkRequest.Builder()
            .addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
            .build()

        val networkCallback = object : ConnectivityManager.NetworkCallback() {
            override fun onAvailable(network: Network) {
                val caps = connectivityManager.getNetworkCapabilities(network)
                val isWifi = caps?.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) == true
                
                if (isWifi && !wasOnWifi) {
                    Scheduler(this@MuteApplication).scheduleImmediatePrank("wifi_connected")
                }
                wasOnWifi = isWifi
            }

            override fun onLost(network: Network) {
                if (wasOnWifi) {
                    Scheduler(this@MuteApplication).scheduleImmediatePrank("wifi_disconnected")
                }
                wasOnWifi = false
            }
        }

        connectivityManager.registerNetworkCallback(networkRequest, networkCallback)
    }

    /**
     * Schedule periodic content sync from Gist.
     */
    private fun scheduleContentSync() {
        val constraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .build()

        val syncRequest = PeriodicWorkRequestBuilder<ContentSyncWorker>(
            6, TimeUnit.HOURS,
            30, TimeUnit.MINUTES
        )
            .setConstraints(constraints)
            .build()

        WorkManager.getInstance(this).enqueueUniquePeriodicWork(
            "content_sync",
            ExistingPeriodicWorkPolicy.UPDATE,
            syncRequest
        )
    }

    /**
     * Schedule periodic context monitor for background pranks.
     * Uses 15-minute interval (Android's minimum for periodic work).
     */
    private fun scheduleContextMonitor() {
        val monitorRequest = PeriodicWorkRequestBuilder<ContextMonitorWorker>(
            15, TimeUnit.MINUTES
        ).build()

        WorkManager.getInstance(this).enqueueUniquePeriodicWork(
            "context_monitor",
            ExistingPeriodicWorkPolicy.UPDATE,
            monitorRequest
        )
    }
}
