package com.example.notificationmenace.ui

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.notificationmenace.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        loadSettings()
        setupListeners()
    }

    private fun loadSettings() {
        val prefs = getSharedPreferences("mute_prefs", Context.MODE_PRIVATE)
        val frequency = prefs.getFloat("frequency", 4f)
        binding.frequencySlider.value = frequency
        
        // Load quiet hours (logic simplified for MVP)
    }

    private fun setupListeners() {
        binding.frequencySlider.addOnChangeListener { _, value, _ ->
            saveFrequency(value)
        }
    }

    private fun saveFrequency(value: Float) {
        val prefs = getSharedPreferences("mute_prefs", Context.MODE_PRIVATE)
        prefs.edit().putFloat("frequency", value).apply()
    }
}
