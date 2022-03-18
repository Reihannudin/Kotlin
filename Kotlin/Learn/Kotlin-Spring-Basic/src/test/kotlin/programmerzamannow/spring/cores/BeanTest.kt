package programmerzamannow.spring.cores

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import programmerzamannow.spring.cores.data.Foo

class BeanTest {
//    Bean will running as Singleton
//    make test BeanConfiguration
    @Test
    fun testBean(){
    //  define BeanConfiguration to be context with AnnotationConfigApplicationContext
        val context = AnnotationConfigApplicationContext(BeanConfiguration::class.java)
        Assertions.assertNotNull(context) //  check context is not null
    }

//    make test get bean
    @Test
    fun testGetBean(){
   //  define BeanConfiguration to be context with AnnotationConfigApplicationContext
        val context = AnnotationConfigApplicationContext(BeanConfiguration::class.java)
        val beanFoo1 = context.getBean(Foo::class.java) //  get bean Foo from Foo class
        val beanFoo2 = context.getBean(Foo::class.java) //  get bean Foo from Foo class

//    check beanFoo1 and beanFoo2 are same
        Assertions.assertSame(beanFoo1, beanFoo2)
    }
}