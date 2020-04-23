package com.example.dagger.module

import com.example.dagger.engine.model.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule(var name: String) {

    @Provides
    @Singleton
    fun provideDriver(): Driver {
        return Driver(name = name)
    }
}