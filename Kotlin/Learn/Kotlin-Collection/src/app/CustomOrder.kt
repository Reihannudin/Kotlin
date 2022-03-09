package app
//make data class
data class Fruit(val name: String, val quantity: Int)

fun main() {
    val fruit = listOf(
        Fruit("Apple", 5),
        Fruit("Orange", 10),
        Fruit("Banana", 15)
    )
//    print sorted fruits acsending
    println(fruit.sortedBy { it.name })
    println(fruit.sortedBy { it.quantity })

//    print sorted fruits decsending
    println(fruit.sortedByDescending { it.name })
    println(fruit.sortedByDescending { it.quantity })

//    make custom order
    val fruit1 = fruit.sortedWith(Comparator { fruit1, fruit2 ->
        fruit1.quantity.compareTo(fruit2.quantity)
    })
    println(fruit1)
}
