package programmerzamannow.spring.cores

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.ObjectProvider
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import programmerzamannow.spring.cores.data.Foo
import java.util.stream.Collectors

class BeanFactoryTest {
//    acsses more than one bean use Bean Factory
    @Test
    fun testBeanFactory(){
         val context = AnnotationConfigApplicationContext(ScanConfiguration::class.java)
         context.registerShutdownHook()

//        make bean factory (fooObjectProvider)
        val fooObjectProvider : ObjectProvider<Foo> = context.getBeanProvider(Foo::class.java)
//      make foo bean factorylist
        val fooList : List<Foo> = fooObjectProvider.stream().collect(Collectors.toList())
        println(fooList) // [Foo(name=foo1), Foo(name=foo2), Foo(name=foo3)]

//        get fooList name
        val beansName : Map<String, Foo> = context.getBeansOfType(Foo::class.java)
        println(beansName) // {foo1=Foo(name=foo1), foo2=Foo(name=foo2), foo3=Foo(name=foo3)}

    }
}

