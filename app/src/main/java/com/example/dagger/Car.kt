package com.example.dagger

import com.example.dagger.engine.model.Engine
import com.example.dagger.wheel.wheel
import timber.log.Timber
import javax.inject.Inject


class Car @Inject constructor(Engine: Engine, wheel: wheel) {
    var TAG: String = javaClass.simpleName


    fun drive(){
    Timber.tag(TAG).d("Driving.....")
    }
}