package org.example.lesson_1_10

fun main() {
    val greetings = "Здраствуйте"
    val space = ' '
    val username = "Звездный Лорд"
    // конкатенация строк
    println(greetings + ", " + username + "!" + space + "Какой будет ваш главный вопрос?")
    // интерполяция строк
    println("$greetings, $username! Какой будет ваш главный вопрос?")
    println("На который можно ответить ${40+2}")
    // многострочный текст
    val multiString = """
        |строка 1
            |строка 2
        |строка 3
    """.trimMargin()
    println(multiString)
    val str = "a\nb\nc\nd"
    println(str)
    val str1 = "a" +
            "b" +
            "c" +
            "d"
    println(str1)
    val str2 = "a\n" +
            "b\n" +
            "c\n" +
            "d"
    println(str2)}