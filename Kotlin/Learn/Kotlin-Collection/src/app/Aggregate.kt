package app

fun main() {
//    make a variable with range data inside
    val numbers = (1..100).toList()
//    make argegat Maximum
    val max = numbers.maxOrNull()
    println("Max: $max")
//    make argegat Minimum
    val min = numbers.minOrNull()
    println("Min: $min")
//    make argegat avarent
    val average = numbers.average()
    println("Average: $average")
//    make argegat sum
    val sum = numbers.sum()
    println("Sum: $sum")

//    make agregat with selector
    val sum2 = numbers.sumOf { it / 2 }
    println("Sum2: $sum2")

}