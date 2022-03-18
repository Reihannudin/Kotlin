package programmerzamannow.spring.cores

import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import programmerzamannow.spring.cores.data.Foo

//make configuration
@Configuration
class DuplicateBeanConfiguration {
    //    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)

//    make bean  1
    @Bean
    fun foo1(): Foo {
        log.info("foo1 called")
        return Foo() // return bean
    }

//    make bean 2
    @Bean
    fun foo2(): Foo {
        log.info("foo2 called")
        return Foo() // return bean
    }

}