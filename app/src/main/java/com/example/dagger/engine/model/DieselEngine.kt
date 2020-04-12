package com.example.dagger.engine.model

import timber.log.Timber

class DieselEngine constructor(val horsePower: Int) : Engine {

    var TAG: String = javaClass.simpleName

    override fun startEngine() {
        Timber.tag(TAG).d("Diesel Engine Starts ..... with  $horsePower Horsepower")

    }

}