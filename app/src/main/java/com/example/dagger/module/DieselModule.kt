package com.example.dagger.module

import com.example.dagger.engine.model.DieselEngine
import com.example.dagger.engine.model.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselModule {

    /*   @Provides
       fun providesEngine(dieselEngine: DieselEngine):Engine{
           return dieselEngine
       }*/

    //Instead of @Provides we can use @Bind (Hence the DieselModule class and method becomes an abstract class) since the return type is the same as the super class of The DieselEngine Class

    @Binds
    abstract fun providesEngine(dieselEngine: DieselEngine): Engine
}