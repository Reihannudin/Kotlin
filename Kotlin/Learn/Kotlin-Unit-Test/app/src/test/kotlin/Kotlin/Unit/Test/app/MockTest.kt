package Kotlin.Unit.Test.app

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito

class MockTest {
//    make test
    @Test
    fun testMock(){ // make function
//    make properties list with mockito
        val list: List<String> = Mockito.mock(List::class.java) as List<String>

//    add Mockito beavior and getting index
        Mockito.`when`(list.get(0)).thenReturn("Andrian")
        Mockito.`when`(list.get(1)).thenReturn("Reihannudin")

//    test Mock
        assertEquals("Andrian", list.get(0))
        assertEquals("Andrian", list.get(0))
        assertEquals("Reihannudin", list.get(1))

//        println(list.get(0))
//        println(list.get(1))

//    verify Mock
        Mockito.verify(list, Mockito.times(2)).get(0)
        Mockito.verify(list).get(1)
    }
}




