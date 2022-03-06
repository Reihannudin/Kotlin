package app

import data.Game
import data.Login
import data.MinMax

//make functions MinMax
fun minmax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value2)
        else -> MinMax(value1, value2)
    }
}

fun login(login: Login, callback: (Login) -> Boolean) :Boolean{
    return callback(login)
}

fun main() {
//  Variable
    val game = Game("GTA V", 67, 9.2)
//    without destructuring
//    val name = game.name
//    val rating = game.rating
//    val price = game.price
//    With Destructuring Declaration
    val (name, price, rating) = game
    println("Nama Game :$name,Rating: $rating,Harga: $$price")

//    Function
//    without destructuring
//    val result = minmax(10, 100)
//    val min = result.min
//    val max = result.max
//    With Destructuring Declaration
    val (min, max) = minmax(10, 100) // you can used Underscore if u dont use it (min, _)
    println("Min: $min, Max: $max")

//    Lambda
//Call lambda function without destructuring
//    val login = Login("admin", "rahasia")
//    login(login) {login ->
//        login.username == "admin" && login.password == "rahasia"
//    }

//    Call lambda function with destructuring
    val login = Login("admin", "rahasia")
    login(login){ (username, password) ->
        username == "admin" && password == "rahasia"
    }
}