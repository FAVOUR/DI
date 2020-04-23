package com.example.dagger.component

import com.example.dagger.module.DriverModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppLevelComponent {

    //  fun carComponentBuilder(): CarComponent.build
    fun carComponentFactory(): CarComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(driverModule: DriverModule): AppLevelComponent
    }
}