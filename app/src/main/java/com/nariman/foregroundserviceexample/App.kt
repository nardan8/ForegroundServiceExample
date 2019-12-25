package com.nariman.foregroundserviceexample

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build

class App : Application() {

    val CHANNEL_ID = "exampleServiceChannel"

    override fun onCreate() {
        super.onCreate()

        createNotificationChannel()
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val serviceChannel = NotificationChannel(
                CHANNEL_ID,
                "Example Service Channel",
                NotificationManager.IMPORTANCE_DEFAULT
            )

            getSystemService(NotificationManager::class.java).also {
                it!!.createNotificationChannel(serviceChannel)
            }
        }
    }
}