package com.example.dagger.component

import com.example.dagger.MainActivity
import com.example.dagger.module.AirEngineModule
import com.example.dagger.module.WheelModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [WheelModule::class, AirEngineModule::class])
interface CarComponent {
//    fun getCar(): Car


    //This is meant to receive the concrete class as a parameter and in order for the field constructor to work
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        //Done because we are overriding the default builder implementation
        fun build(): CarComponent

        @BindsInstance
        fun horsePower(@Named("horsePower") horsePower: Int): Builder

        @BindsInstance
        fun enginePower(@Named("Engine Power") enginePower: Int): Builder

    }
}