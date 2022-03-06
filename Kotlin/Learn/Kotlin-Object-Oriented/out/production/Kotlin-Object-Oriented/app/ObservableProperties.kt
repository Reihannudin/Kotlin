package app

import data.Account

fun main() {
//    call Observable Properties
    val account = Account()
    account.bio = "Hello World"
    account.bio = "Hello Kotlin"
    account.bio = "With great power comes great responsibility"
}