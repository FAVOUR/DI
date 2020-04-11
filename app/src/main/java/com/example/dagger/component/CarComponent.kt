package com.example.dagger.component

import com.example.dagger.Car
import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car
}