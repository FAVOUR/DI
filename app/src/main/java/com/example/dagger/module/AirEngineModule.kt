package com.example.dagger.module

import com.example.dagger.engine.model.AirEngine
import com.example.dagger.engine.model.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class AirEngineModule {


    @Binds
    abstract fun provideAirEngine(airEngine: AirEngine): Engine


}