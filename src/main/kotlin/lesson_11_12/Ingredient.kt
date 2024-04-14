package lesson_11_12

class Ingredient(val name: String, val weight: Int, val count: Int) {
    var isNeedToPrepare = false

    constructor(
        name: String,
        weight: Int,
        count: Int,
        _isNeedToPrepare: Boolean,
    ) : this(name, weight, count) {
        isNeedToPrepare = _isNeedToPrepare
    }

    init {
        println("Ингредиент $name создан")
    }

    // 1 вторичный конструктор
    // 2 первичный конструктор
    // блоки init
    // тело вторичного конструктора

}

