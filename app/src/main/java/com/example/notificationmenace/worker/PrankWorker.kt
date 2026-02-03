package com.example.notificationmenace.worker

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.example.notificationmenace.data.ContextTrigger
import com.example.notificationmenace.data.PrankRepository
import com.example.notificationmenace.util.CooldownManager
import com.example.notificationmenace.util.LogManager
import com.example.notificationmenace.util.NotificationManagerHelper

class PrankWorker(
    appContext: Context,
    workerParams: WorkerParameters
) : CoroutineWorker(appContext, workerParams) {

    private val repository = PrankRepository
    private val notificationHelper = NotificationManagerHelper(appContext)
    private val cooldownManager = CooldownManager(appContext)

    override suspend fun doWork(): Result {
        val triggerTag = inputData.getString("trigger_tag")
        
        val trigger = if (triggerTag != null) {
            ContextTrigger.fromTag(triggerTag)
        } else {
            ContextTrigger.GENERAL
        }
        
        LogManager.log("ANALYZING CONTEXT: ${trigger.name}")
        
        // Check cooldown before pranking
        val bypassCooldown = inputData.getBoolean("bypass_cooldown", false)
        
        if (!bypassCooldown && !cooldownManager.canPrank(trigger)) {
            LogManager.log("CONTEXT IGNORED: COOLDOWN ACTIVE")
            // Still on cooldown, skip this prank
            return Result.success()
        }
        
        val prank = repository.getPrankForTrigger(trigger)
        
        if (prank == null) {
            LogManager.log("NO PRANKS AVAILABLE FOR: ${trigger.name}")
            return Result.success()
        }

        LogManager.log("EXECUTING PRANK: [${prank.id}] ${prank.senderName}")
        notificationHelper.showNotification(prank)
        
        // Record that we pranked for this trigger
        cooldownManager.recordPrank(trigger)
        
        return Result.success()
    }
}