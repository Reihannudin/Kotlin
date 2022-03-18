package programmerzamannow.spring.cores

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import programmerzamannow.spring.cores.data.Bar
import programmerzamannow.spring.cores.data.Foo
import programmerzamannow.spring.cores.data.FooBar

class DependencyInjectionTest {

//    make Test with DependencyInjection
    @Test
    fun testWithDI(){
//    make context
    val context = AnnotationConfigApplicationContext(DependencyInjectionConfiguration::class.java)
//    get foo from Foo class with bean
    val foo = context.getBean("fooFirst",Foo::class.java)
//    get bar from Bar class with bean
    val bar = context.getBean(Bar::class.java)
//    get fooBar from FooBar class with bean
    val fooBar = context.getBean(FooBar::class.java)

//    make assertion
    Assertions.assertSame(foo, fooBar.getFoo()) //make assertion that foo and fooBar.getFoo() are same
    Assertions.assertSame(bar, fooBar.getBar()) //make assertion that bar and fooBar.getBar() are same
    }


//     make test without DependencyInjection
    @Test
fun testWithoutDI() {
//    get foo from Foo
//    get bar from Bar
    val foo = Foo()
    val bar = Bar()
//    make mannually DependencyInjection foo and bar to FooBar
    val fooBar = FooBar(foo, bar)
//    make assertSame get fooBar from FooBar
    Assertions.assertSame(foo, fooBar.getFoo())
//    make assertSame get bar from FooBar
    Assertions.assertSame(bar, fooBar.getBar())
}
}







