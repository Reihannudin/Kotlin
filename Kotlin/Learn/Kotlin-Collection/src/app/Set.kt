package app

import data.Person

fun main() {
//    Make Set
    val set: Set<Person> = setOf(
        Person("Andrian"),Person("Reihan"), Person("Andrian"),  Person("Raihannudin"), Person("Reihan")
    )

//    Get Set
    println(set)
//    Get Set Size
    println(set.size)
//    Checking there is data in set more than 2
    println(set.contains(Person("Andrian")))
//    loop
    for (person in set) {
        println(person)
    }
}

