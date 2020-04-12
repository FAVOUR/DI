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

    //Instead of @Provides we can use @Bind (Hence the DieselModule class and method becomes an abstract class) since the return type is the same as the super class of The DieselEngine Class

    @Provides
    fun providesEngine(): Engine {
        return DieselEngine(horsePower)

    }
}