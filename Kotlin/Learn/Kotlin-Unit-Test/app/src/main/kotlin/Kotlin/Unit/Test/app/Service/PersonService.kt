package Kotlin.Unit.Test.app.Service

import Kotlin.Unit.Test.app.Model.Person
import Kotlin.Unit.Test.app.Repository.PersonRepository
import java.util.*

//Buissness Logic
// make class and constructor extend from PersonRepository
class PersonService (private val personRepository: PersonRepository) {

    //    make functions to get data from database
    fun getPersonById(id: String): Person {
        if (id.isBlank()) { // make validate id
            throw IllegalArgumentException("Person id is not valid") // throw exception if id is not valid
        }

        val person = personRepository.selectById(id) // make select by id
        if (person != null) { // make validate person
            return person // return person
        } else {
            throw Exception("Person id is not found") // throw exception if id person not found
        }
    }

    //    make functions registered
    fun register(name: String): Person {
//      create validate
        if (name.isBlank()) { // make validate name
            throw IllegalArgumentException("Person name is blank") // throw exception if name is blank
        }
        val id = UUID.randomUUID().toString() // make random id
        val person = Person(id, name) // make person

        personRepository.insert(person) // make insert person
        return person // return person
    }


}
