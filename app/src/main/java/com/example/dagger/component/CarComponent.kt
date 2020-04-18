package com.example.dagger.component

import com.example.dagger.MainActivity
import com.example.dagger.module.AirEngineModule
import com.example.dagger.module.AppLevelScope
import com.example.dagger.module.WheelModule
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@AppLevelScope
@Subcomponent(
    modules = [WheelModule::class, AirEngineModule::class]
)
interface CarComponent {
//    fun getCar(): Car


    //This is meant to receive the concrete class as a parameter and in order for the field constructor to work
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
       interface Builder {

        /***Not necessary when using subcomponent binding



           fun appLevelComponent(appLevelComponent: AppLevelComponent): Builder
         */

        //Done because we are overriding the default builder implementation
        fun build(): CarComponent


           @BindsInstance
           fun horsePower(@Named("horsePower") horsePower: Int): Builder

           @BindsInstance
           fun enginePower(@Named("Engine Power") enginePower: Int): Builder

    }
}