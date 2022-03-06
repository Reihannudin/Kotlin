package app

import data.User


fun main(){
//  PropertiesConstructor
    val user1 = User("John", "RAHASIA")
    val user2 = User("Doe", "RAHASIA")

//    Manipulate Properqties
    user1.username = "Louist91"
    user1.password = "12345"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)

}