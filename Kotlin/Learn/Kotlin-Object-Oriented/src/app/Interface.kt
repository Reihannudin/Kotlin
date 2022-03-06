package app

import data.Human

fun main() {
//    call function from overiding to interface
    val human = Human("Ziyaad")
    human.sayHello("Reihan")
    human.go()
    human.move()
}