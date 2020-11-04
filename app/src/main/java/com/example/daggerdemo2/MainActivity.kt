package com.example.daggerdemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerdemo.CarComponent
import com.example.daggerdemo.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    //lateinit private var myCar:Car
        lateinit @Inject var myCar:Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: CarComponent = DaggerCarComponent.create()
        component.inject(this)

       // myCar=component.getCar()

        myCar.drive()

    }
}