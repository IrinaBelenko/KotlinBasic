package org.example

fun main() {
    val userAge = readLine()!!.toInt()
    val resultText = if (userAge >= AGE_OF_MAJORITY1) "Показать экран со скрытым контентом"
    else if (userAge == 16 || userAge == 17) "Показать экран с ограниченным контентом"
    else "Вернуться на главный экран"

//    println(resultText)

    val consoleNumber = when (userAge) {
        10 -> {
            println("Дополнительное действие, если ввели 10")
            "Ввели число 10"
        }
        20 -> "Ввели число 20"
        42 -> "Ввели число 42"
        else -> "Ввели другое число"
    }
    println(consoleNumber)
}

const val AGE_OF_MAJORITY1 = 18