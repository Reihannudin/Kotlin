package programmerzamannow.spring.cores.data

import org.slf4j.LoggerFactory
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

class Server {
//    lifeCycle
    //    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)

//    use @PostConstruct annotation to run this method after the object is created
    @PostConstruct
//    make a method to start server
    fun start() {
        log.info("Start server")
    }

    @PreDestroy
    fun stop() {
        log.info("Stop server")
    }
}