package programmerzamannow.spring.cores

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import programmerzamannow.spring.cores.client.PaymentGatewayClient

class FactoryTest {
    @Test
    fun testFactory(){
        val context = AnnotationConfigApplicationContext(FactoryConfiguration::class.java)
        context.registerShutdownHook()

        val paymentGatewayClient = context.getBean(PaymentGatewayClient::class.java)
//         assertions
        Assertions.assertNotNull(paymentGatewayClient)
        Assertions.assertEquals("https://example.com/", paymentGatewayClient.getEndPoint())
        Assertions.assertEquals("private", paymentGatewayClient.getPrivateKey())
        Assertions.assertEquals("public", paymentGatewayClient.getPublicKey())

    }

}