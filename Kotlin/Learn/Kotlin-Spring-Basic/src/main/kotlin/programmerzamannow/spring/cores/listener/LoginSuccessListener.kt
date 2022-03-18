package programmerzamannow.spring.cores.listener

import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component
import programmerzamannow.spring.cores.event.LoginSuccessEvent

@Component
class LoginSuccessListener: ApplicationListener<LoginSuccessEvent> {

    //    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)

    override fun onApplicationEvent(event: LoginSuccessEvent) {
        log.info("Success login for use  ${event.getUser()}")
    }
}