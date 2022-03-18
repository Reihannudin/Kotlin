package programmerzamannow.spring.cores.service

import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationEventPublisher
import org.springframework.context.ApplicationEventPublisherAware
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component
import programmerzamannow.spring.cores.data.User
import programmerzamannow.spring.cores.event.LoginSuccessEvent


@Component

class UserService : ApplicationEventPublisherAware {

    private lateinit var applicationEventPublisher: ApplicationEventPublisher

    override fun setApplicationEventPublisher(applicationEventPublisher: ApplicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher
    }

    fun login(username: String, password: String): Boolean {
        return if (isLoginSuccess(username, password)) {
            applicationEventPublisher.publishEvent(LoginSuccessEvent(User(username)))
            true
        } else {
            false
        }
    }

    private fun isLoginSuccess(username: String, password: String): Boolean {
     return "Reihan".equals(username, ignoreCase = true) && "Andrian240326".equals(password, ignoreCase = false)
    }


}
