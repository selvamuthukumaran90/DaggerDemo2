package com.example.daggerdemo2

import android.util.Log
import com.example.daggerdemo.Engine
import com.example.daggerdemo.Wheel
import javax.inject.Inject

class Car @Inject constructor(val engine: Engine, val wheel: Wheel) {
//class Car(val engine:Engine,val wheel:Wheel) {
fun drive(){
    Log.e("tag","driving..")
}
}