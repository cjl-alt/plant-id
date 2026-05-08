package com.example.plant_id.worker

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.ListenableWorker
import androidx.work.Data

class WateringReminderWorker(
    context: Context,
    workerParams: WorkerParameters
) : Worker(context, workerParams) {

    override fun doWork(): Result {
        try {
            // 获取偏好设置（修复了 Context 报错）
            val sharedPref = applicationContext.getSharedPreferences(
                "plant_prefs",
                Context.MODE_PRIVATE
            )

            // 这里可以写你的提醒逻辑（如通知）
            return Result.success()
        } catch (e: Exception) {
            return Result.failure()
        }
    }
}
