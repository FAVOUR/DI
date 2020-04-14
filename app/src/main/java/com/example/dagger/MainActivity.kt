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

//        val carComponent: CarComponent = DaggerCarComponent.create() //This happened because one of the Modules is accepting a parameter
        val carComponent: CarComponent = DaggerCarComponent.builder()
            .horsePower(100)
            .enginePower(10000)
            .appLevelComponent((application as App).AppComponentComponent)
//            .airEngineModule(AirEngineModule(100))
            .build()


        /*  DaggerCarComponent.builder()
          .horsePower(100)
          .enginePower(10000)
//            .airEngineModule(AirEngineModule(100))
          .build()
*/
        //For constructor Injection
//       var car:Car= carComponent.getCar()

        //Make sure you use the concrete class and not the super class in my cas it is the MainActivity
        carComponent.inject(this)

        //Call the drive method in the instantiated car class
        car.drive()

    }

}
