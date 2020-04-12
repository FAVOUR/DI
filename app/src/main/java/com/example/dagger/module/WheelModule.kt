package com.example.dagger.module

import com.example.dagger.wheel.Break
import com.example.dagger.wheel.Rim
import com.example.dagger.wheel.Wheel
import dagger.Module
import dagger.Provides

@Module
class WheelModule {
    //Whenever the provides method does not depend on the instance state of the module we use the Static  keyword (in java ) to  further  optimise  performance
//  because dagger does not need to instantiate the module but call the method directly on the class
    @Provides
    fun provideRim(): Rim {
        return Rim()
    }

    @Provides
    fun provideBreak(): Break {
        val _break = Break()
        //This proves that you can do any configuration within  the provides method
        _break.pushBreakFoward()
        return _break

    }


    @Provides
    fun provideWheels(rim: Rim, _break: Break): Wheel {
        return Wheel(rim, _break)
    }
}