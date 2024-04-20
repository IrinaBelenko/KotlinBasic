package org.example.lesson_1_10.lesson_14

import java.util.Calendar


fun main() {

    // анонимные функции
    // лямбды

    val calendar: Calendar = Calendar.getInstance()

    val getDaysToEndYear = fun(): Int = 365 - calendar[Calendar.DAY_OF_YEAR]

    println(getDaysToEndYear())

    val convertEndDaysToMills = fun(endDays: Int) = println(1000*60*60*24*endDays)
    convertEndDaysToMills(getDaysToEndYear())

    val printStringWithLambda: (Int) -> String

    printStringWithLambda = { answer: Int ->
        "print string with lambda $answer"
    }

    println( printStringWithLambda(42));
    // короткая запись
    println({it: Int -> "print string with lambda $it" }(442))

    val convertLambda = {endDays: Int ->
        println("Convert from lambda: ${1000*60*60*24*endDays}")
    }

    convertLambda(getDaysToEndYear())
}

