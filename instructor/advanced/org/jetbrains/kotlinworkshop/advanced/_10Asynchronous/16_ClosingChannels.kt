package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


suspend fun main() = coroutineScope {
    val channel = Channel<Int>()

    launch {
        for (x in 1..7) {
            channel.send(x * x)
        }
        channel.close()
    }
    for (y in channel) {
        println(channel.receive())
    }
}

