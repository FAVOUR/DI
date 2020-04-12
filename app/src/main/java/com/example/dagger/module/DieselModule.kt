package com.example.dagger.module

import com.example.dagger.engine.model.DieselEngine
import com.example.dagger.engine.model.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselModule constructor(val horsePower: Int) {

    /*   @Provides
       fun providesEngine(dieselEngine: DieselEngine):Engine{
           return dieselEngine
       }*/


    @Provides
    fun providesEngine(): Engine {
        return DieselEngine(horsePower)

    }
}