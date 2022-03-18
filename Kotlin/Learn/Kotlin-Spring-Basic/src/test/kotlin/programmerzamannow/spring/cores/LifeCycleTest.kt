package programmerzamannow.spring.cores

import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import programmerzamannow.spring.cores.data.Connection
import programmerzamannow.spring.cores.data.Server

class LifeCycleTest {
//     make test LifeCycle Connection
    @Test
    fun testConnection(){
//        make context
        val context = AnnotationConfigApplicationContext(LifeCycleConfiguration::class.java)
//    to closed connection use this
        context.registerShutdownHook()
//    make test connections
    val connection = context.getBean(Connection::class.java)
    }

//    make test LifeCycle Server
    @Test
    fun testServer(){
//        make context
        val context = AnnotationConfigApplicationContext(LifeCycleConfiguration::class.java)
//    make test server
        val server = context.getBean(Server::class.java)
    //    to closed connection use this
        context.registerShutdownHook()
    }
}