package programmerzamannow.spring.cores.commandapp

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.util.*

@Component
class LogCommandLineRunner : CommandLineRunner {
    //    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)

    override fun run(vararg args: String?) {
        log.info("LogCommandLineRunner is ${Arrays.toString(args)}")
    }
}
