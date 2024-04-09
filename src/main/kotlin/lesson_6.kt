package org.example

fun main() {
    var counter = 0
//    while (counter > 0) {
//        println("Реклама закончится через ${counter--}")
//        Thread.sleep(1000)
//    }

//    do {
//        println("Реклама закончится через ${counter--}")
//        Thread.sleep(1000)
//    } while (false)
    while (counter <= 5) print(++counter)
}

