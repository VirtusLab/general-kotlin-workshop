package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout


suspend fun main() = coroutineScope {
    withTimeout(3000) {
        timeoutProcess()
    }
}

suspend fun timeoutProcess() {
    delay(5000)
    println("timeoutProcess called")
}
