package com.example.dagger.module

import com.example.dagger.engine.model.DieselEngine
import com.example.dagger.engine.model.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolModule {


    /*   @Provides
       fun providesEngine( petrolEngine: petrolEngine):Engine{
           return  petrolEngine
       }*/

    //Instead of @Provides we can use @Bind (Hence the PetrolModule class and method becomes an abstract class) since the return type is the same as the super class of The PetrolEngine Class
    //This could be your best bet when the class is a concrete class of an interface
    @Binds
    abstract fun providesEngine(dieselEngine: DieselEngine): Engine

}