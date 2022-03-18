package programmerzamannow.spring.cores

import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import programmerzamannow.spring.cores.data.Bar
import programmerzamannow.spring.cores.data.Foo

class ScanTest {

//    make test
    @Test
    fun testScan() {
//         make context
        val context = AnnotationConfigApplicationContext(ScanConfiguration::class.java)
        context.registerShutdownHook() //  closed connection use this
//    get foo
        val foo = context.getBean(Foo::class.java)
//    get bar
        val bar = context.getBean(Bar::class.java)

    }
}