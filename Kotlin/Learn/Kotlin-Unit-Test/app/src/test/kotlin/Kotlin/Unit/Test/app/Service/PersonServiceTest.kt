package Kotlin.Unit.Test.app.Service

import Kotlin.Unit.Test.app.Model.Person
import Kotlin.Unit.Test.app.Repository.PersonRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension

//Extension mockito
@Extensions(value = [
    ExtendWith(MockitoExtension::class)
])
//make class test
class PersonServiceTest {

//    mockings variable
    @Mock
//    make lateinit variable extend PersonRepository
    lateinit var personRepository: PersonRepository

//    make lateinit variable extend PersonService
    lateinit var personService: PersonService

//    make beforeEach
    @BeforeEach
//make function and set up variable to PersonService add PersonRepository
    fun beforeEach() {
        personService = PersonService(personRepository)
    }

//    Scenario: Person ID is not valid
//    make Test if person Id is not valid
    @Test
    fun testPersonIdIsNotValid() {
//        make assertThrows
        assertThrows<IllegalArgumentException> {
//          set up variable personService and call function getPersonById
            personService.getPersonById("      ")
        }
    }

//    Scenario: Person ID is not Found
//    make Test if person Id is not Found
    @Test
    fun testPersonIdIsNotFound() {
//        make assertThrows
        assertThrows<Exception> {
//          set up variable personService and call function getPersonById
            personService.getPersonById("Id is not found")
        }
    }

//    Scenario: Person ID is success
//    make Test if person Id is success
    @Test
    fun testPersonIdIsSuccess() {
//    add behavior if personRepository call selectById with parameter: 240326
//    we will return person with name is: Andrian Raihannudin
    Mockito.`when`(personRepository.selectById("240326"))
        .thenReturn(Person("240326", "Andrian Raihannudin"))


//        set up variable person and call function getPersonById"
        val person = personService.getPersonById("240326");
//        make assertEquals for id
        assertEquals("240326", person.id)
//    make assertEquals for name
        assertEquals("Andrian Raihannudin", person.name)
    }

//    make test testRegisterPersonNameIsBlank
    @Test
    fun testRegisterPersonNameIsBlank() {
//        make assertThrows
        assertThrows<IllegalArgumentException> {
//          set up variable personService and call function registerPerson
            personService.register("    ")
        }
    }

//    make test register success
    @Test
    fun testRegisterPersonNameIsSuccess() {
    //        set up variable person and call function registerPerson
        val person = personService.register("Andrian Raihannudin");

//        make assertEquals for name
        assertEquals("Andrian Raihannudin", person.name)
//    make assertNotNull for id
        assertNotNull(person.id)

//    verify that personRepository.insert was called

        Mockito.verify(personRepository, Mockito.times(1)).insert(Person(person.id,"Andrian Raihannudin"))
    }


}