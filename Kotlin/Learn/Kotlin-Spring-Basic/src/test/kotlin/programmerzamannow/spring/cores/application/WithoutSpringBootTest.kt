package programmerzamannow.spring.cores.application

import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import programmerzamannow.spring.cores.data.Foo

class WithoutSpringBootTest {

    @Test
    fun testFoo(){
        val context = AnnotationConfigApplicationContext(FooAplicationFailure::class.java)
        context.registerShutdownHook()

        val foo = context.getBean(Foo::class.java)
    }
}