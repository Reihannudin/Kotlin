package programmerzamannow.spring.cores.application.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import programmerzamannow.spring.cores.data.Foo
import programmerzamannow.spring.cores.listener.AppStartingListener

@SpringBootApplication
class FooApplication {

    @Bean
    fun foo(): Foo {
        return Foo()
    }
}

fun main(args: Array<String>) {
    val applicationContext = SpringApplication.run(FooApplication::class.java, *args)

    val foo = applicationContext.getBean(Foo::class.java)
    print(foo.toString())
}

