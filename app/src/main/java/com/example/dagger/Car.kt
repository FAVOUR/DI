package com.example.dagger

//import com.example.dagger.remote.Remote
import com.example.dagger.engine.model.Driver
import com.example.dagger.engine.model.Engine
import com.example.dagger.module.AppLevelScope
import com.example.dagger.wheel.Wheel
import timber.log.Timber
import javax.inject.Inject

//Note that
@AppLevelScope
class Car @Inject constructor(val engine: Engine, val wheel: Wheel, val driver: Driver) {
    var TAG: String = javaClass.simpleName


//    @Inject
//    fun enableRemote(remote: Remote) {
//        remote.setListener(this)
//    }

    fun drive(){
        engine.startEngine()
        Timber.tag(TAG).d("$this ${driver.name} Driving..... $driver")
    }


}

