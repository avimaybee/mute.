package com.example.notificationmenace.worker

import android.content.Context
import androidx.work.ListenableWorker
import androidx.work.WorkerParameters
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertTrue
import org.junit.Test

class ContentSyncWorkerTest {

    @Test
    fun doWork_failsWithBadUrl_returnsRetry() {
        val context = mockk<Context>(relaxed = true)
        val params = mockk<WorkerParameters>(relaxed = true)
        
        val worker = ContentSyncWorker(context, params)
        
        runBlocking {
            val result = worker.doWork()
            assertTrue("Worker should retry on network/parsing failure", result is ListenableWorker.Result.Retry)
        }
    }
}
