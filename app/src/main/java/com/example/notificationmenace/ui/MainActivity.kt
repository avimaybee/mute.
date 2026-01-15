package com.example.notificationmenace.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.example.notificationmenace.databinding.ActivityMainBinding
import com.example.notificationmenace.worker.PrankWorker

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        setupUI()
    }

    private fun setupUI() {
        binding.testNotificationButton.setOnClickListener {
            triggerTestNotification()
        }
        binding.settingsButton.setOnClickListener {
            startActivity(android.content.Intent(this, SettingsActivity::class.java))
        }
    }

    private fun triggerTestNotification() {
        val workRequest = OneTimeWorkRequestBuilder<PrankWorker>().build()
        WorkManager.getInstance(this).enqueue(workRequest)
    }
}