package com.example.notificationmenace.ui

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.example.notificationmenace.databinding.ActivityMainBinding
import com.example.notificationmenace.worker.PrankWorker

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted: Boolean ->
        if (isGranted) {
            Toast.makeText(this, "Notifications enabled", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Notifications denied. Pranks won't work.", Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        setupUI()
        checkNotificationPermission()
    }

    private fun checkNotificationPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            when {
                ContextCompat.checkSelfPermission(
                    this,
                    Manifest.permission.POST_NOTIFICATIONS
                ) == PackageManager.PERMISSION_GRANTED -> {
                    // Permission already granted
                }
                else -> {
                    requestPermissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
                }
            }
        }
    }

    private fun setupUI() {
        binding.testNotificationButton.setOnClickListener {
            triggerTestNotification()
        }
        binding.settingsButton.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }
    }

    private fun triggerTestNotification() {
        val workRequest = OneTimeWorkRequestBuilder<PrankWorker>().build()
        WorkManager.getInstance(this).enqueue(workRequest)
        Toast.makeText(this, "Scheduling test prank...", Toast.LENGTH_SHORT).show()
    }
}
