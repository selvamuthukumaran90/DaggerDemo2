package com.example.daggerdemo

import com.example.daggerdemo2.Rim
import com.example.daggerdemo2.Tire

// if we cant own this class, then we can't annotate it with @Inject. If this class is in external library
class Wheel(val rim: Rim, val tire: Tire)
//class Wheel