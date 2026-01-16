package com.example.notificationmenace.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.notificationmenace.data.PrankRepository
import com.example.notificationmenace.databinding.ActivityGotchaBinding
import com.example.notificationmenace.util.NotificationManagerHelper

class GotchaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGotchaBinding
    private val repository = PrankRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGotchaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        val prankId = intent.getIntExtra(NotificationManagerHelper.EXTRA_PRANK_ID, -1)
        if (prankId != -1) {
            val prank = repository.getPrankById(prankId)
            prank?.let {
                binding.punchlineText.text = it.punchlineText
            }
        }
    }
}