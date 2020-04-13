package com.example.dagger.engine.model

import timber.log.Timber
import javax.inject.Inject
import javax.inject.Named


class AirEngine @Inject constructor(@Named("horsePower") var horsePower: Int, @Named("Engine Power") var enginePower: Int) :
    Engine {
    var TAG: String = javaClass.simpleName


    override fun startEngine() {
        Timber.tag(TAG)
            .d("AirEngine Engine Starts ..... with  $horsePower Horsepower and .... \n  $enginePower   EnginePower")

    }
}