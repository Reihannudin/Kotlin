package app

import data.Account

fun main() {
//    call lazy properties lambda will be print once and next is the properties
    val account = Account()
    println(account.name)
    println(account.name)

//    Call eager properties
    println(account.age)
}

