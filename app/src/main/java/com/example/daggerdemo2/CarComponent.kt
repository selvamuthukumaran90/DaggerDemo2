package com.example.daggerdemo

import com.example.daggerdemo2.Car
import com.example.daggerdemo2.MainActivity
import com.example.daggerdemo2.WHeelsModule
import dagger.Component

@Component (modules = arrayOf(WHeelsModule::class))
interface CarComponent {
   fun getCar(): Car

   //for field injection i have to right below code. method name is not a matter
   fun inject(mainActivity: MainActivity)
}