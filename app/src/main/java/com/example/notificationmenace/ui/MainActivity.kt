package com.example.notificationmenace.ui

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import com.example.notificationmenace.ui.theme.MuteTheme
import com.example.notificationmenace.util.LogManager
import com.example.notificationmenace.util.Scheduler
import com.example.notificationmenace.worker.ContentSyncWorker
import android.content.Intent

class MainActivity : ComponentActivity() {

    private val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted: Boolean ->
        if (isGranted) {
            schedulePrank()
        } else {
            LogManager.log("PERMISSION DENIED: Notifications")
            Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        setContent {
            MuteTheme {
                MuteApp(
                    onTestTrigger = { checkPermissionAndSchedulePrank() },
                    onSyncTrigger = { triggerSync() },
                    onClearLog = { LogManager.clear() },
                    onSettingsClick = { startActivity(Intent(this, SettingsActivity::class.java)) }
                )
            }
        }
    }

    private fun checkPermissionAndSchedulePrank() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED) {
                schedulePrank()
            } else {
                requestPermissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
            }
        } else {
            schedulePrank()
        }
    }

    private fun schedulePrank() {
        Scheduler(this).scheduleImmediatePrank("test_trigger", bypassCooldown = true)
        LogManager.log("TEST TRIGGER INITIATED")
        Toast.makeText(this, "Protocol Executed: 5s", Toast.LENGTH_SHORT).show()
    }

    private fun triggerSync() {
        LogManager.log("MANUAL SYNC INITIATED...")
        val syncRequest = OneTimeWorkRequest.Builder(ContentSyncWorker::class.java).build()
        WorkManager.getInstance(this).enqueue(syncRequest)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MuteApp(
    onTestTrigger: () -> Unit,
    onSyncTrigger: () -> Unit,
    onClearLog: () -> Unit,
    onSettingsClick: () -> Unit
) {
    val haptic = LocalHapticFeedback.current
    val context = LocalContext.current
    val logs by LogManager.logs.observeAsState("")
    
    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()
    
    // Protocol State
    val prefs = context.getSharedPreferences("mute_prefs", Context.MODE_PRIVATE)
    var isArmed by remember { mutableStateOf(prefs.getBoolean("protocol_active", true)) }

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            LargeTopAppBar(
                title = { Text("Mute") },
                actions = {
                    IconButton(onClick = onSettingsClick) {
                        Icon(Icons.Default.Settings, contentDescription = "Settings")
                    }
                },
                scrollBehavior = scrollBehavior
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { 
                    haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                    onClearLog()
                    Toast.makeText(context, "System Log Purged", Toast.LENGTH_SHORT).show()
                }
            ) {
                Icon(Icons.Default.DeleteSweep, contentDescription = "Clear Log")
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(horizontal = 16.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // PROTOCOL STATUS CARD
            ElevatedCard(
                modifier = Modifier.fillMaxWidth()
            ) {
                ListItem(
                    headlineContent = { Text(if (isArmed) "System Armed" else "System Disarmed") },
                    supportingContent = { Text("Protocol Status") },
                    leadingContent = {
                        Icon(
                            if (isArmed) Icons.Default.Shield else Icons.Default.ShieldMoon,
                            contentDescription = null,
                            tint = if (isArmed) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    },
                    trailingContent = {
                        Switch(
                            checked = isArmed,
                            onCheckedChange = { checked ->
                                isArmed = checked
                                prefs.edit().putBoolean("protocol_active", checked).apply()
                                LogManager.log("PROTOCOL STATE: ${if (checked) "ARMED" else "DISARMED"}")
                                if (checked) {
                                    haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                                } else {
                                    haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                                }
                            }
                        )
                    }
                )
            }

            Text(
                "Quick Actions",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary
            )

            // ACTIONS SECTION
            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                FilledTonalButton(
                    onClick = { 
                        haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                        onTestTrigger() 
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(Icons.Default.NotificationImportant, contentDescription = null)
                    Spacer(Modifier.width(8.dp))
                    Text("Trigger")
                }

                OutlinedButton(
                    onClick = { 
                        haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                        onSyncTrigger() 
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(Icons.Default.Sync, contentDescription = null)
                    Spacer(Modifier.width(8.dp))
                    Text("Sync")
                }
            }
            
            Text(
                "System Log",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary
            )

            // SYSTEM LOG SECTION
            OutlinedCard(
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(modifier = Modifier.height(250.dp).padding(16.dp)) {
                    val scrollState = rememberScrollState()
                    LaunchedEffect(logs) {
                        scrollState.animateScrollTo(scrollState.maxValue)
                    }
                    
                    Text(
                        text = logs.ifEmpty { "Waiting for events..." },
                        fontFamily = FontFamily.Monospace,
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier
                            .fillMaxWidth()
                            .verticalScroll(scrollState)
                    )
                }
            }
            
            Spacer(modifier = Modifier.height(88.dp))
        }
    }
}
