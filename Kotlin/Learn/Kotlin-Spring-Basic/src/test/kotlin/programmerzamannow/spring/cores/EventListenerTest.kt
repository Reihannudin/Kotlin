package programmerzamannow.spring.cores

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import programmerzamannow.spring.cores.listener.LoginAgainSuccessListener
import programmerzamannow.spring.cores.listener.LoginSuccessListener
import programmerzamannow.spring.cores.listener.UserListener
import programmerzamannow.spring.cores.service.UserService

class EventListenerTest {

    //    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)

    @Configuration
    @Import(value = [UserService::class,
                     LoginSuccessListener::class,
                     LoginAgainSuccessListener::class,
                     UserListener::class])
    class TestConfiguration{

    }

//     make test
    @Test
    fun testEvent(){
        val context = AnnotationConfigApplicationContext(TestConfiguration::class.java)

//         get bean
        val userService = context.getBean(UserService::class.java)
        log.info(userService.login("reihan", "andrian123456").toString())
        log.info(userService.login("Reihan", "Andrian240326").toString())
        log.info(userService.login("Andrian", "Andrian123456").toString())

        context.registerShutdownHook()


}
}