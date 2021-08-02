package com.example.interviewapplication

import android.app.Application
import timber.log.Timber

class InterviewApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}