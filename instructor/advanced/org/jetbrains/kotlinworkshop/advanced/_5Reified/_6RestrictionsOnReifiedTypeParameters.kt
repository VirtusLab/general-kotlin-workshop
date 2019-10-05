package org.jetbrains.kotlinworkshop.advanced._5Reified

// Which of the following calls won't compile?

inline fun <reified T> baz(t: T) {
//    bar(t)
}

fun <T> bar(t: T) {
//    baz(t)
}