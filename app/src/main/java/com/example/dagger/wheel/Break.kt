package com.example.dagger.wheel

import timber.log.Timber

class Break {
    var TAG: String = javaClass.simpleName

    fun pushBreakFoward() {
        Timber.tag(TAG).d("Car stops.....")

    }
}