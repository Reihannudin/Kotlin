package programmerzamannow.spring.cores.runnerapp

import org.springframework.boot.SpringApplication

import org.springframework.boot.autoconfigure.SpringBootApplication
import programmerzamannow.spring.cores.commandapp.CommandApp


@SpringBootApplication
class RunnerApplication {
}


fun main(args: Array<String>) {
    SpringApplication.run(RunnerApplication::class.java, *args)
}

/*
fun main(args: Array<String>) {
    SpringApplication.run(CommandApp::class.java, *args)
}*/
