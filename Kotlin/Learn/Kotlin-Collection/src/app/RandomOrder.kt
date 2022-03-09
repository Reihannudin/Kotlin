package app

fun main() {
    val numbers = (1..100).toList()
//    shuffled all data
    println(numbers.shuffled()) //
//    shuffled first 3 data
    println(numbers.shuffled().take(3)) //

}