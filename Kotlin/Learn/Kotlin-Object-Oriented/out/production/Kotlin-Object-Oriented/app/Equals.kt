package app

import data.Corporation

fun main(){
    val company1 = Corporation("Google")
    val company2 = Corporation("Google")

    println(company1 == company2)
    println(company1 == company1)

}