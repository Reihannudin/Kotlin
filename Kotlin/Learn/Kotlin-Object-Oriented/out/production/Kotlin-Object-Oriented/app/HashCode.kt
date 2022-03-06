package app

import data.Corporation

fun main() {
    val company1 = Corporation("Google")
    val company2 = Corporation("Google")

    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())
}