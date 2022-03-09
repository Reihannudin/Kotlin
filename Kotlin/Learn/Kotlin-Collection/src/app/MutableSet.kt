package app

import data.Person

fun main(){
//    make mutableSet
    val mutableSet:  MutableSet<Person> = mutableSetOf()

//    add elements to set
    mutableSet.add(Person("Andrian"))
    mutableSet.add(Person("Raihannudin"))
    mutableSet.add(Person("Raihannudin"))
    mutableSet.add(Person("Reihannudin"))
    mutableSet.add(Person("Andrian"))

//    exceute with loop
    for (person in mutableSet){
        println(person)
    }

}