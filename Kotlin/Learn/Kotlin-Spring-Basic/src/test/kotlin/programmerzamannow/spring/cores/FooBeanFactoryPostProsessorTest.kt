package programmerzamannow.spring.cores

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import programmerzamannow.spring.cores.data.Foo
import programmerzamannow.spring.cores.prossesor.FooBeanFactoryPostProsessor

class FooBeanFactoryPostProsessorTest {

    @Configuration
    @Import(FooBeanFactoryPostProsessor::class)
    class TestConfigurations {

    }

//     make test bean factory post processor
    @Test
    fun testBeanFactoryPostProcessor() {
        val context = AnnotationConfigApplicationContext(TestConfigurations::class.java)
        context.registerShutdownHook()

//    get bean
        val foo = context.getBean(Foo::class.java)
        println(foo)

//    assertionn
       Assertions.assertNotNull(foo)
    }
}