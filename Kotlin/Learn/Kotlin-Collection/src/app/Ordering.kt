package app

fun main() {
    val numbers = listOf(4, 5, 1, 2, 2)
//    sorted ascending
    var sortedAscending = numbers.sorted()
//    sorted descending
    var sortedDescending = numbers.sortedDescending()

    println(sortedAscending)
    println(sortedDescending)
}