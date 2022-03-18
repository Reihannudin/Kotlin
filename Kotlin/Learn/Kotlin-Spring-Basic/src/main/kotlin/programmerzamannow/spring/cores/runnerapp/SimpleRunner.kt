package programmerzamannow.spring.cores.runnerapp

import org.slf4j.LoggerFactory
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import java.lang.Exception

@Component
class SimpleRunner : ApplicationRunner {
    //    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)

    @Throws(Exception::class)
    override fun run(args: ApplicationArguments?) {
        val profile : List<String> = args?.getOptionValues("profile") ?: listOf("default")
        log.info("Profile: $profile")
    }
}

//        log.info("LogCommandLineRunner is ${Arrays.toString(args)}")