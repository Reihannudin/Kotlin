package programmerzamannow.spring.cores

import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.DependsOn
import programmerzamannow.spring.cores.data.Bar
import programmerzamannow.spring.cores.data.Foo
import org.springframework.context.annotation.Lazy

//Add configuration
@Configuration
class DependsOnConfiguration {
    //    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)

//    make bean fun foo extends Foo class
    @Bean
    @Lazy // make fun foo lazy, created when it is called
//Add DependsOn annotation
   @DependsOn("bar") // depends on for custom priority get order of bean

    fun foo(): Foo{
        log.info("Created new foo")
        return Foo()
    }

//    make bean fun bar extends Bar class
    @Bean
    fun bar(): Bar{
        log.info("Created new bar")
        return Bar()
    }
}