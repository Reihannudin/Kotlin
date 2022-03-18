package programmerzamannow.spring.cores.application.failure

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import programmerzamannow.spring.cores.data.Bar
import programmerzamannow.spring.cores.data.Foo

@SpringBootApplication
class FooAplicationFailure {
    @Bean
    fun fooFail(): Foo {
        return Foo()
    }
}

fun main(args: Array<String>) {
    var applicationContext = SpringApplication.run(FooAplicationFailure::class.java, *args)

    var foo = applicationContext.getBean(Foo::class.java)
    print(foo.toString())
}
