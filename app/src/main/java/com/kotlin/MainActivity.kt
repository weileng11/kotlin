package com.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var s=10
    var score=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (s in 0..100) {
        }
        fun getScore():Int{
            return  score;
        }
    }
}
