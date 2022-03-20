package programmerzamannow.learnspingbootdesignpattern.singleton

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

// add annotation SpringBootApplication
@SpringBootApplication
class SingletonApplication {

//     add bean
    @Bean
    fun counter(): Counter { // add Counter
        return Counter() // return Counter
    }

}