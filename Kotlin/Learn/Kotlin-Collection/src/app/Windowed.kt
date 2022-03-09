package app

fun main() {
    val numbers = (1.. 5).toList()

//    Windowed
    println(numbers.windowed(3, 1, false)) // [[1, 2, 3], [2, 3, 4], [3, 4, 5]]
    println(numbers.windowed(3, 1, false){it.size}) // [3, 3, 3]
    println(numbers.windowed(3, 1, true)) // [[1, 2, 3], [2, 3, 4], [3, 4, 5], [4, 5], [5]]
    println(numbers.windowed(3, 1, true){it.size}) // [3, 3, 3, 2, 1]

    println(numbers.windowed(3, 2, false)) // [[1, 2, 3], [3, 4, 5]]
    println(numbers.windowed(3, 2, true)) //[[1, 2, 3], [3, 4, 5], [5]]




}