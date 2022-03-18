package programmerzamannow.spring.cores

import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import programmerzamannow.spring.cores.data.Foo

@Configuration
class BeanNameConfiguration {
    //    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)

    //    make bean primary
    @Primary
    @Bean(name = ["fooPrimary"])
    fun fooPrimary(): Foo {
        log.info("foo primary called")
        return Foo() // return bean
    }
    //    make bean  1
    @Bean(name = ["fooFirst"])
    fun foo1(): Foo {
        log.info("foo1 called")
        return Foo() // return bean
    }

    //    make bean 2
    @Bean(name = ["fooSecond"])
    fun foo2(): Foo {
        log.info("foo2 called")
        return Foo() // return bean
    }

}