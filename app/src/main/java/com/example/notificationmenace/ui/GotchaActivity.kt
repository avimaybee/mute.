package com.example.notificationmenace.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.notificationmenace.databinding.ActivityGotchaBinding

class GotchaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGotchaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGotchaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        displayPunchline()
    }

    private fun displayPunchline() {
        // Logic to display the prank punchline
    }
}
