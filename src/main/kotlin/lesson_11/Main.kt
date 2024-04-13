package lesson_11

fun main() {
    val dish1: Dish = Dish(
        id = 1,
        name = "Яичница",
        category = "Завтраки",
        ingredients = listOf("яйцо", "помидор", "соль", "перец"),
    )
    val dish2: Dish = Dish(
        id = 2,
        name = "Суп лапша",
        category = "Обеды",
        ingredients = listOf("вода", "курица", "вермишель", "соль", "перец"),
    )

//    println(dish1.name)
//    println(dish1.ingredients)
//    println(dish1.inFavorites)
//    println()
//    println(dish2.name)
//    println(dish2.ingredients)
//    println(dish2.inFavorites)

//    dish1.category = "Блюда из яиц"
//    dish1.inFavorites = true

    println("Действия для блюда Яичница")
    dish1.addToFavorites()
    println(dish1.inFavorites)
    dish1.startCooking()

    println()

    println("Действия для блюда Суп лапша")
    dish2.addToFavorites()
    println(dish1.inFavorites)
    val ingredientsForSoup = dish2.downloadIngredients()
    println(ingredientsForSoup)
    dish2.removeFromFavorites()
    println(dish2.inFavorites)
}