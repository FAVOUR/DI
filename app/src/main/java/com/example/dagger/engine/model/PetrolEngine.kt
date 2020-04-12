package com.example.dagger.engine.model

import timber.log.Timber
import javax.inject.Inject


class PetrolEngine @Inject constructor() : Engine {

    var TAG: String = javaClass.simpleName

    override fun startEngine() {
        Timber.tag(TAG).d("Petrol Engine Starts .....")

    }
}