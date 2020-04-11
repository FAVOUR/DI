package com.example.dagger

import android.nfc.Tag
import com.example.dagger.engine.model.Engine
import com.example.dagger.wheel.wheel
import timber.log.Timber
import javax.inject.Inject


class Car{
       var TAG :String= javaClass.name
    @Inject
    constructor(Engine: Engine, wheel: wheel)


    fun drive(){
    Timber.tag(TAG).d("Driving.....")
    }
}