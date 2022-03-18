package programmerzamannow.spring.cores.listener

import org.slf4j.LoggerFactory
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import programmerzamannow.spring.cores.event.LoginSuccessEvent


@Component
class UserListener {
    //    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)

//     add Annotations eventListener
//     can add more than one eventListener
    @EventListener(classes = [LoginSuccessEvent::class])
    fun onLoginSuccessEvent1 (event: LoginSuccessEvent) {
        log.info("Succes login again for user 1 ${event.getUser()}")
    }

    //     add Annotations eventListener
    @EventListener(classes = [LoginSuccessEvent::class])
    fun onLoginSuccessEvent2  (event: LoginSuccessEvent) {
        log.info("Succes login again for user 2 ${event.getUser()}")
    }

    //     add Annotations eventListener
    @EventListener(classes = [LoginSuccessEvent::class])
    fun onLoginSuccessEvent3 (event: LoginSuccessEvent) {
        log.info("Succes login again for user 3 ${event.getUser()}")
    }
}







