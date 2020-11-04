package com.example.daggerdemo2

import com.example.daggerdemo.Wheel
import dagger.Module
import dagger.Provides

@Module
class WHeelsModule {

    //not neccessary to put into companion object.

        @Provides
        fun provideRim():Rim{
            return Rim()
        }

        @Provides
        fun provideTire():Tire{
            return Tire().run{
                inflate()
                this
            }
        }
        @Provides
        fun provideWheels(rim:Rim,tire:Tire): Wheel {
            return Wheel(rim,tire)
        }



}