package programmerzamannow.spring.cores


import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import programmerzamannow.spring.cores.data.Foo

//    Bean will running as Singleton

//make configuration spring
@Configuration
class BeanConfiguration {
//    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)
//     make bean spring
    @Bean
// make function foo
    fun foo(): Foo {
        val foo = Foo() // make constructor foo extend class Foo
        log.info("Created new foo bean") // add logging
        return foo // return foo
    }
}
