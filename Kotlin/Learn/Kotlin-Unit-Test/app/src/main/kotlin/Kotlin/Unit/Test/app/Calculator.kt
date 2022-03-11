package Kotlin.Unit.Test.app

class Calculator {

//    make function sum
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
//    make function sub
    fun sub(a: Int, b: Int): Int {
        return a - b
    }
//    make function mul
    fun mul(a: Int, b: Int): Int {
        return a * b
    }
//    make function div
    fun div(a: Int, b: Int): Int {
    if (b == 0) {
        throw IllegalArgumentException("Division by zero")
    }
        return a / b
    }
}