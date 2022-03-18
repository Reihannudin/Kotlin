package programmerzamannow.spring.cores.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import programmerzamannow.spring.cores.data.Foo

// add Configuration
@Configuration
class FooConfiguration {
//    add Bean
    @Bean
    @Primary
    fun foo(): Foo {
        return Foo()
    }

    @Bean
    fun foo2(): Foo {
        return Foo()
    }

    @Bean
    fun foo3(): Foo {
        return Foo()
    }
}