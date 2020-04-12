package com.example.dagger.component

import com.example.dagger.MainActivity
import com.example.dagger.module.DieselModule
import com.example.dagger.module.WheelModule
import dagger.Component

@Component(modules = [WheelModule::class, DieselModule::class])
interface CarComponent {
//    fun getCar(): Car


    //This is meant to receive the concrete class as a parameter and in order for the field constructor to work
    fun inject(mainActivity: MainActivity)
}