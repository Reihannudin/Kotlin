package programmerzamannow.spring.cores.commandapp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class CommandApp {

}
fun main(args: Array<String>) {
    SpringApplication.run(CommandApp::class.java, *args)
}