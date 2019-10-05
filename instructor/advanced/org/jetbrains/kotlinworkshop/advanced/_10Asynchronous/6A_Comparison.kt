package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.*
import kotlin.concurrent.thread


fun threads() {
    val jobs = 1..100000
    jobs.forEach {

        thread {
            Thread.sleep(1000L)
            print(".")
        }
    }
}


suspend fun coroutines() = coroutineScope {
    val jobs = List(100000) {
        GlobalScope.launch() {
            delay(1000L)
            print(".")
        }
    }
    jobs.forEach { it.join() }
}



suspend fun main() {

    coroutines()
    // threads()

}