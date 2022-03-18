package programmerzamannow.spring.cores.data

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.InitializingBean
import org.springframework.beans.factory.DisposableBean
import java.lang.Exception
import kotlin.Throws

// make class Connection and implement InitializingBean and DisposableBean
class Connection : InitializingBean, DisposableBean {
    //    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)

    // make method afterPropertiesSet to open connection
    @Throws(Exception::class)
    override fun afterPropertiesSet() {
        log.info("Connection is ready to use")
    }

// make method destroy to closed connection
    @Throws(Exception::class)
    override fun destroy() {
        log.info("Connection is closed")
    }
}