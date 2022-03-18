package programmerzamannow.spring.cores.listener

import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component
import programmerzamannow.spring.cores.event.LoginSuccessEvent

@Component
class LoginAgainSuccessListener : ApplicationListener<LoginSuccessEvent> {
    //    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)

    override fun onApplicationEvent(event: LoginSuccessEvent) {
        log.info("Success login again for use: ${event.getUser()}")
    }
}