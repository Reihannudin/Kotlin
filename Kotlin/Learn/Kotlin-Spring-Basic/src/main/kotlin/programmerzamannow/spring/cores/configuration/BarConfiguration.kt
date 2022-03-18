package programmerzamannow.spring.cores.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import programmerzamannow.spring.cores.data.Bar

//add BarConfiguration

@Configuration
class BarConfiguration {
//    make Bean
    @Bean
    fun bar(): Bar {
        return Bar()
    }
}