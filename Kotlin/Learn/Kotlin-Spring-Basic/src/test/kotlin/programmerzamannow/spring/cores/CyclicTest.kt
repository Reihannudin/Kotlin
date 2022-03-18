package programmerzamannow.spring.cores

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class CyclicTest {

//    make test Cyclic circular
    @Test
    fun testCyclic(){

//    make assertThrows
    Assertions.assertThrows(Throwable::class.java){
        val context = AnnotationConfigApplicationContext(CyclicConfiguration::class.java)
       }
    }
}

