package programmerzamannow.spring.cores

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import programmerzamannow.spring.cores.data.Foo

class PrimaryBeanTest {
    //    make test
    @Test
    fun testGetPrimaryBean(){
        // make context
        val context = AnnotationConfigApplicationContext(PrimaryConfiguration::class.java)
        // get bean primary
        val fooPrimary = context.getBean(Foo::class.java)
        // get bean foo1
        val foo1 = context.getBean("foo1",Foo::class.java)
        // get bean foo2
        val foo2 = context.getBean("foo2",Foo::class.java)

        // assert assertNotSame
        Assertions.assertNotSame(fooPrimary,foo1)
        Assertions.assertNotSame(fooPrimary,foo2)
    }

}