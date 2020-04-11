package com.example.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger.component.CarComponent
import com.example.dagger.component.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent: CarComponent = DaggerCarComponent.create()

        //For constructor Injection
        val cons_car: Car = carComponent.getCar()

        //calling the drive method for constructor injection
        cons_car.drive()

        //Make sure you use the concrete class and not the super class in my cast it is the MainActivity
        carComponent.inject(this)

        //Call the drive method in the instantiated car class
        car.drive()


    }

}
