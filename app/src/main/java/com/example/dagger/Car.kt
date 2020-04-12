package com.example.dagger

import com.example.dagger.engine.model.Engine
//import com.example.dagger.remote.Remote
import com.example.dagger.wheel.Wheel
import timber.log.Timber
import javax.inject.Inject

//Note that
class Car @Inject constructor(Engine: Engine, wheel: Wheel) {
    var TAG: String = javaClass.simpleName


//    @Inject
//    fun enableRemote(remote: Remote) {
//        remote.setListener(this)
//    }

    fun drive(){
    Timber.tag(TAG).d("Driving.....")
    }
}

