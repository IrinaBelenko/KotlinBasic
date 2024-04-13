package org.example

fun main() {
    printNameAndAge(getName(), getAge())
}

fun getName(): String? {
    println("Введите имя:")
    return readLine()
}

fun getAge(): Int? {
    println("Введите возраст:")
    return readLine()?.toInt()
}

fun printNameAndAge(userName: String?, userAge: Int?) = println("Данные пользователя: $userName, $userAge лет")
