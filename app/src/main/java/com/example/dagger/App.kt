package com.example.dagger

import android.app.Application
import com.example.dagger.component.AppLevelComponent
import com.example.dagger.component.DaggerAppLevelComponent
import com.example.dagger.module.DriverModule
import timber.log.Timber

class App:Application() {


    lateinit var AppComponentComponent: AppLevelComponent
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())

        AppComponentComponent = DaggerAppLevelComponent.factory().create(DriverModule("Holla"))


    }

}