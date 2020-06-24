package com.example.whatisyourstrippername

import android.app.Application
import timber.log.Timber

class StripperApplication: Application(){
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())

    }

}