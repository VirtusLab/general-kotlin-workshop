package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis


suspend fun main() = coroutineScope {

    val time = measureTimeMillis {
        val one = async(Dispatchers.Default, CoroutineStart.LAZY) { function1() }
        val two = async(Dispatchers.Default, CoroutineStart.LAZY) { function2() }
        println("Result is ${one.await() + two.await()}")
    }
    println("Total time: $time")

}


