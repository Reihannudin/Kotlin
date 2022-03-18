package programmerzamannow.spring.cores

import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import programmerzamannow.spring.cores.data.Bar
import programmerzamannow.spring.cores.data.Foo

class ImportTest {

//     make test import
    @Test
    fun testImport() {
//         make context
        val context = AnnotationConfigApplicationContext(MainConfiguration::class.java)
//        make foo
        val foo = context.getBean(Foo::class.java)
//        make bar
        val bar = context.getBean(Bar::class.java)
    }
}