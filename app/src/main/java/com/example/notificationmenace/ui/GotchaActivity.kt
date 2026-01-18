package com.example.notificationmenace.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.scaleIn
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.notificationmenace.data.PrankRepository
import com.example.notificationmenace.ui.theme.MuteTheme
import com.example.notificationmenace.util.NotificationManagerHelper

class GotchaActivity : ComponentActivity() {

    private val repository = PrankRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        val prankId = intent.getIntExtra(NotificationManagerHelper.EXTRA_PRANK_ID, -1)
        val punchline = if (prankId != -1) {
            repository.getPrankById(prankId)?.punchlineText ?: "Gotcha!"
        } else {
            "Gotcha!"
        }

        setContent {
            MuteTheme {
                GotchaScreen(punchline = punchline)
            }
        }
    }
}

@Composable
fun GotchaScreen(punchline: String) {
    var visible by remember { mutableStateOf(false) }
    
    LaunchedEffect(Unit) {
        visible = true
    }

    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp)
        ) {
            AnimatedVisibility(
                visible = visible,
                enter = fadeIn(animationSpec = tween(1000)) + 
                        scaleIn(initialScale = 0.5f, animationSpec = tween(1000))
            ) {
                Text(
                    text = punchline,
                    style = MaterialTheme.typography.displayMedium,
                    color = MaterialTheme.colorScheme.primary,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}