package com.example.dagger.component

import com.example.dagger.engine.model.Driver
import com.example.dagger.module.DriverModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppLevelComponent {

    fun getDriver(): Driver

}