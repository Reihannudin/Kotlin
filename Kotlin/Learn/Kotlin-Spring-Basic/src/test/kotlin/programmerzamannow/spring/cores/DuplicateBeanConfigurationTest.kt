package programmerzamannow.spring.cores

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.NoUniqueBeanDefinitionException
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import programmerzamannow.spring.cores.data.Foo

class DuplicateBeanConfigurationTest {
//     make test call type data bean meanwhile have a duplicate bean
    @Test
    fun testBeanDuplicate(){
    //    create a context
        val context = AnnotationConfigApplicationContext(DuplicateBeanConfiguration::class.java)
    //    throw exception if bean is duplicate
        Assertions.assertThrows(NoUniqueBeanDefinitionException::class.java){
            context.getBean(Foo::class.java)
        }
    }

//    make test get duplicate bean
    @Test
    fun getBean(){
    //    create a context
    val context = AnnotationConfigApplicationContext(DuplicateBeanConfiguration::class.java)
    //    get bean by name
        val foo1: Foo = context.getBean("foo1", Foo::class.java)
        val foo2: Foo = context.getBean("foo2", Foo::class.java)
    //    Assertions if bean is not same as name
        Assertions.assertNotSame(foo1, foo2)
    }
}