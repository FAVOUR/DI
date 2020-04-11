package com.example.dagger.component

import com.example.dagger.MainActivity
import dagger.Component

@Component
interface CarComponent {
//    fun getCar(): Car


    //This is meant to receive the concrete class as a parameter and in order for the field constructor to work
    fun inject(mainActivity: MainActivity)
}