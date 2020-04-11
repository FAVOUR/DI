package com.example.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger.component.CarComponent
import com.example.dagger.component.DaggerCarComponent
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var carComponent:CarComponent=DaggerCarComponent.create()

       var car:Car= carComponent.getCar()

        car.drive()

    }

}
