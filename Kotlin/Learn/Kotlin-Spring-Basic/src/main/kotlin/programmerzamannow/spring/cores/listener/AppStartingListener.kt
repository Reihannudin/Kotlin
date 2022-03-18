package programmerzamannow.spring.cores.listener

import org.slf4j.LoggerFactory
import org.springframework.boot.context.event.ApplicationStartedEvent
import org.springframework.context.ApplicationListener

class AppStartingListener : ApplicationListener<ApplicationStartedEvent> {
    //    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)

    override fun onApplicationEvent(event: ApplicationStartedEvent) {
        log.info("Application Started")
    }
}