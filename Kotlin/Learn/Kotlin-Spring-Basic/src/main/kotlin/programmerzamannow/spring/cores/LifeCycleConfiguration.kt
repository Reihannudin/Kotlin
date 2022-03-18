package programmerzamannow.spring.cores

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import programmerzamannow.spring.cores.data.Connection
import programmerzamannow.spring.cores.data.Server

//add configuration
@Configuration
class LifeCycleConfiguration {
//     make Bean function connections to Connections
    @Bean
    fun connections(): Connection {
        return Connection() //return Connection
    }

//     make Bean function server to Server
//    call init method from class Server
//    @Bean(initMethod = "start", destroyMethod = "stop")

//    if use PostConstruct and PreDestroy you not should use initMethod and destroyMethod
    @Bean
    fun server (): Server {
        return Server() //return Server
    }

}