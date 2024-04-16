package org.example.lesson_1_10.lesson_14

import lesson_17.BabelFish


fun main() {

    val fish = BabelFish(null)

    println("old value: ${fish.nerveSignalLevel}")
//    println("old value: ${fish.isTranslated}")
//    fish.nerveSignalLevel = 400
//    println("new value: ${fish.nerveSignalLevel}")
//    println("new value: ${fish.isTranslated}")
//
    val fish2 = BabelFish(2)
    println("old value: ${fish2.nerveSignalLevel}")
    val fish3 = BabelFish(21)
    println("old value: ${fish3.nerveSignalLevel}")
}


