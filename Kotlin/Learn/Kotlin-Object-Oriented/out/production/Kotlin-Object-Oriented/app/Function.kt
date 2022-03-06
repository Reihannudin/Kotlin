package app

import data.Person

fun main(){
    val person = Person()
    person.firstName = "Andrian"
    person.middleName = ""
    person.lastName = "Reihannudin"

    person.sayHello("Ziyaad")
    person.run()
    val fullname = person.getFullName()
    print(fullname)
}