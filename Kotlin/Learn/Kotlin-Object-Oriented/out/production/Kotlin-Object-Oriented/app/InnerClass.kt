package app

import data.Boss

fun main() {
//    call outer class
    val boss = Boss("Reihan")
//    call inner class
    val employee1 = boss.Employee("ziyaad")

//    call the function
    employee1.hi()
}


