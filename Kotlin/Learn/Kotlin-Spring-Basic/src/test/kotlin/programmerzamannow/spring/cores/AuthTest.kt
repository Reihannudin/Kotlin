package programmerzamannow.spring.cores

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import programmerzamannow.spring.cores.service.AuthService


class AuthTest {

    @Configuration
    @Import(value = [
        AuthService::class
    ])
    class TestConfiguration(){

    }

    @Test
    fun testAware(){
        val context = AnnotationConfigApplicationContext(TestConfiguration::class.java)
        context.registerShutdownHook()

        var authService = context.getBean(AuthService::class.java)
//        Assertion
        Assertions.assertEquals("programmerzamannow.spring.cores.service.AuthService", authService.getBeanName())
        Assertions.assertNotNull(authService.getApplicationContext())

    }

}