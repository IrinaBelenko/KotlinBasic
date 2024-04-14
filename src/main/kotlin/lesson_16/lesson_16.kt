package org.example.lesson_1_10.lesson_14

import lesson_15.Upsilon
import lesson_16.HitchhikerGuide
import lesson_16.Support

fun main() {

    // public
    // private
    // protected
    // internal

    val guide = HitchhikerGuide()

//    guide.title = "Don't panic"
//    guide.chooseArticle()
    println(guide.getNumberOfPages())
    guide.setNumberOfPages(42_000)
    println(guide.getNumberOfPages())

//    Support().printInfo()
}


