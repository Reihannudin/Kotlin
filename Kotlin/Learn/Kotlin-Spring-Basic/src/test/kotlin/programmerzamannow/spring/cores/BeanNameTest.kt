package programmerzamannow.spring.cores

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import programmerzamannow.spring.cores.data.Foo

class BeanNameTest {
//    make test assest bean with name
    @Test
    fun testNameBean(){
    //    make context
    val context = AnnotationConfigApplicationContext(BeanNameConfiguration::class.java)
    //    get bean primary
    val fooPrimary = context.getBean(Foo::class.java)
    //    get bean fooFirst
    val foo1 = context.getBean("fooFirst", Foo::class.java)
    //    get bean fooSecond
    val foo2 = context.getBean("fooSecond", Foo::class.java)

//    check assertions
    Assertions.assertNotNull(fooPrimary)
    Assertions.assertNotSame(foo2, foo1)
    }

}