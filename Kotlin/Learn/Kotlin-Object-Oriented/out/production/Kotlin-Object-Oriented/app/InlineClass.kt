package app

import data.Token

fun main() {
    val token = Token("token")
    println(token.value)
    println(token.toUpper())
}