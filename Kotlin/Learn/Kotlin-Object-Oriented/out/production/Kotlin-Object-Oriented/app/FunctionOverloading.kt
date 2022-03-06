package app

import data.Person

fun main(){
    val person = Person()
    person.firstName = "Reihan"

    person.sayHello("Ziyaad")
    person.sayHello("Ahmad", "Ziyaad")
}