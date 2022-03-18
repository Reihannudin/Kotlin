package programmerzamannow.spring.cores

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import programmerzamannow.spring.cores.data.Bar
import programmerzamannow.spring.cores.data.Foo

class ScopeTest {
//     make context
val context = AnnotationConfigApplicationContext(ScopeConfiguration::class.java)
//    make test
    @Test
    fun test() {
        val foo1 = context.getBean(Foo::class.java)
        val foo2 = context.getBean(Foo::class.java)
        val foo3 = context.getBean(Foo::class.java)

//    make assertions
    Assertions.assertNotSame(foo1, foo2)
    Assertions.assertNotSame(foo1, foo3)
    Assertions.assertNotSame(foo2, foo3)
    }


//    Test DoubleTone Scope
    @Test
    fun testDoubleToneScope() {
        val bar1 = context.getBean(Bar::class.java)
        val bar2 = context.getBean(Bar::class.java)
        val bar3 = context.getBean(Bar::class.java)
        val bar4 = context.getBean(Bar::class.java)

//    Assertions
        Assertions.assertSame(bar1, bar3)
        Assertions.assertSame(bar2, bar4)
        Assertions.assertNotSame(bar1, bar2)
        Assertions.assertNotSame(bar1, bar4)
    }
}