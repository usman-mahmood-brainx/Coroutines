package com.example.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("Before launching coroutines")

        // Launch the first coroutine
        GlobalScope.launch {
            println("Coroutine 1 started")
            delay(3000)
            println("Coroutine 1 finished")
        }

        // Launch the second coroutine
        GlobalScope.launch {
            println("Coroutine 2 started")
            delay(3000)
            println("Coroutine 2 finished")
        }

        println("After launching coroutines")

        // Block the main thread to keep the program running
        runBlocking {
            delay(5000)
        }

        println("Program finished")


//        setContentView(R.layout.activity_main)
//        val time = measureTimeMillis {
//            runBlocking {
//                for(i in 1..100000) {
//                    launch {
//                        delay(10000L)
//                    }
//                }
//            }
//        }
//        println("Time is : $time")
    }
}