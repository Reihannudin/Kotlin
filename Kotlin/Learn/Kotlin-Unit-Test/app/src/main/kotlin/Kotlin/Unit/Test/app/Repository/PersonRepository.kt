package Kotlin.Unit.Test.app.Repository

import Kotlin.Unit.Test.app.Model.Person

//make interfaces PersonRepository
interface PersonRepository {
//    make functions selectById
    fun selectById(id: String): Person?
//    make function insert
    fun insert(person: Person)
}