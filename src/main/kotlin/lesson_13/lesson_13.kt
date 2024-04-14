package org.example.lesson_1_10.lesson_13

fun main() {
    // NullPointerException (NPE)
    // null

    val nullableString: String? = null
    val nonNullableString: String = "some string"

//    if (nullableString != null) println(nullableString.length)
//    else println("Переменная хранит null")
//
//    println(nullableString?.length)
//    println(nonNullableString.length)

    val nullableLine: String? = readLine()

    val stringLength: Int = nullableLine?.length ?: 0
    println(stringLength)
// !! - это не null. отказ от проверки на null, когда точно уверен, что null не придет
//    val stringLength2: Int = nullableString!!.length
}


