package programmerzamannow.spring.cores.application.customize

import org.springframework.boot.Banner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.Bean
import programmerzamannow.spring.cores.data.Foo
import programmerzamannow.spring.cores.listener.AppStartingListener

@SpringBootApplication
class CustomizeSpringApplication {
    @Bean
    fun fooCostumize(): Foo {
        return Foo()
    }
}

fun main(args: Array<String>) {
    val application = SpringApplication(CustomizeSpringApplication::class.java)
    application.setBannerMode(Banner.Mode.OFF)
    application.setListeners(listOf(AppStartingListener()))


    val applicationContext : ConfigurableApplicationContext = application.run(*args)

    val foo : Foo = applicationContext.getBean(Foo::class.java)
    println(foo.toString())
}
