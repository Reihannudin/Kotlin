package app

import data.Person

fun main() {
//    Make Object
    val name = Person()

//    Manipulation Properties
    name.firstName = "Andrian"
    name.middleName = ""//null // Dont Use null bcs will be print
    name.lastName = "Raihannudin"

//    Make Variable
    var fullName = name.firstName + " " + name.middleName + " " + name.lastName

//    Call Properties
    println(name.firstName)
    println(name.middleName)
    println(name.lastName)
//    Call Variable
    println(fullName)
}
