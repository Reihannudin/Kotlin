package programmerzamannow.spring.cores

import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import programmerzamannow.spring.cores.data.Foo

class DependsOnTest {
//     make test DependsOn
    @Test
    fun testDependsOn() {
        val context = AnnotationConfigApplicationContext(DependsOnConfiguration::class.java)
        context.getBean(Foo::class.java) // access lazy bean
    }

}