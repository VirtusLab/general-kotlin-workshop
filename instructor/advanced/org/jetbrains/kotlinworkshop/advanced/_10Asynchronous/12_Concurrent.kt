package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


suspend fun main() = coroutineScope {

    val time = measureTimeMillis {
        val one = async(Dispatchers.Default) { function1() }
        val two = async(Dispatchers.Default) { function2() }
        println("Result is ${one.await() + two.await()}")
    }
    println("Total time: $time")

}


