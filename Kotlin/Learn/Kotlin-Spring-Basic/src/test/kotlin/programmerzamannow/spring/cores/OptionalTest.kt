package programmerzamannow.spring.cores

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import programmerzamannow.spring.cores.data.Foo
import programmerzamannow.spring.cores.data.FooBar
import programmerzamannow.spring.cores.data.MultiFoo

class OptionalTest {

    @Test
    fun testObjectProvider(){
        val context = AnnotationConfigApplicationContext(ComponentConfiguration::class.java)
        context.registerShutdownHook()

        val multiFoo: MultiFoo = context.getBean(MultiFoo::class.java)
        Assertions.assertEquals(3, multiFoo.getFoos().size)

    }


}