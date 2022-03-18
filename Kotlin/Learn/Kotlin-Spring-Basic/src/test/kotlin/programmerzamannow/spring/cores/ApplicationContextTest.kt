package programmerzamannow.spring.cores

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class ApplicationContextTest {

//     make test
    @Test
//    make ApplicationContextTest
    fun testApplicationContext(){
    //   make context Application Context use class AnnotationConfigApplicationContext
        val context = AnnotationConfigApplicationContext(HelloWorldConfiguration::class.java)
//    make assertNotNull
        assertNotNull(context)
    }
}