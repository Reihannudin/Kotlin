package app

fun main() {
    val range = (1..10).toList()

//    check if range contains 5
    println(range.contains(5))
//    check if range containsAll list of numbers
    println(range.containsAll(listOf(1, 2, 3, 4, 5)))
//    check if range is empty
    println(range.isEmpty())
//    check if range is not empty
    println(range.isNotEmpty())
}