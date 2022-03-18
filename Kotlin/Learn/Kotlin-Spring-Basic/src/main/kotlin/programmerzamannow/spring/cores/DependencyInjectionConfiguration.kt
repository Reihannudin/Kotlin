package programmerzamannow.spring.cores

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import programmerzamannow.spring.cores.data.Bar
import programmerzamannow.spring.cores.data.Foo
import programmerzamannow.spring.cores.data.FooBar

//add configuration
@Configuration
class DependencyInjectionConfiguration {
    //    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)

//    add bean
    @Primary
    @Bean(name = ["fooFirst"]) //name of bean
    fun foo1(): Foo { // make function extend Foo
    log.debug("foofirst()")
        return Foo() // return new instance of Foo
    }

    //    add bean
    @Bean(name = ["fooSecond"]) // make bean name fooSecond
    fun foo2(): Foo { // make function extend Foo
        log.debug("fooSecond()")
        return Foo() // return new instance of Foo
    }
//    Add bean
    @Bean
    fun bar(): Bar { // make function extend Bar
        return Bar() // return new instance of Bar
    }

//    make DependencyInjection
//    add bean
    @Bean
    fun fooBar(@Qualifier("fooFirst")foo: Foo, bar : Bar): FooBar { // make function extend FooBar add parameter Bar and Foo
        return FooBar(foo1(), bar()) // return new instance of FooBar with parameter foo and bar
    }
}

