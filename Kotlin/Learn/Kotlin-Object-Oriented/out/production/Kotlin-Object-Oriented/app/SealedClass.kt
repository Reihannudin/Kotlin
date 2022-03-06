package app

import data.*
//make operation function from sealed class
//so sealed class is you define 1 class but you can define multiple class in it
fun operation(value1: Int, value2: Int, operator: Operation): Int {
    return when (operator) {
//        Call inherit sealed class
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Multiply -> value1 * value2
        is Divide -> value1 / value2
    }
}

fun main() {
    println(operation(10, 20, Plus()))
    println(operation(10, 20, Minus()))
    println(operation(10, 20, Multiply()))
    println(operation(10, 20, Divide()))
}