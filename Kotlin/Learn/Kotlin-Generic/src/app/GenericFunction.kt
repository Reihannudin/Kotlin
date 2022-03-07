package app

import data.Function

fun main() {
//    Access Generic Functions
    val genericFunctions = Function("Reihan")
//    Access Generic Functions String
    genericFunctions.sayHello<String>("Ziyad")
//    Access Generic Functions Int
    genericFunctions.count<Int>(43)
}
