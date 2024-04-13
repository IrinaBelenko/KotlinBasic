package org.example.lesson_1_10

fun main() {

    val arrayOfIngredients: Array<String> = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")
    val array: IntArray = intArrayOf(4, 4, 2)
    val charArray1: CharArray = charArrayOf('4', '4', '2')

    val intArray2 = intArrayOf()
    var intArray3 = intArrayOf(1, 2, 3, 4, 5)
    intArray3 = intArrayOf(1, 2, 3, 4, 5)

//    println("Размер массива с ингридиентами: ${arrayOfIngredients.size}")
    println(arrayOfIngredients.indexOf("помидор"))
//    println(arrayOfIngredients[1])
//    println(arrayOfIngredients[2])
//    println(arrayOfIngredients[5]) //error
//    arrayOfIngredients[4] = "паприка"
//    println(arrayOfIngredients[4])
//    println(arrayOfIngredients.get(1))
//    arrayOfIngredients.set(1, "капуста")
//    println(arrayOfIngredients.get(1))

    for (i in arrayOfIngredients) {
        println("Ингридиент ${arrayOfIngredients.indexOf(i) + 1}: $i")
    }
    for (i in 0 until array.size) println(array[i])
}

