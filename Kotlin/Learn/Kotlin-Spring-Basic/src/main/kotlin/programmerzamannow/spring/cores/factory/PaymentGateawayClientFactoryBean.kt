package programmerzamannow.spring.cores.factory

import org.springframework.beans.factory.FactoryBean
import org.springframework.stereotype.Component
import programmerzamannow.spring.cores.client.PaymentGatewayClient

//add components
@Component("paymentGatewayClient")
class PaymentGateawayClientFactoryBean : FactoryBean<PaymentGatewayClient>{

    override fun getObject(): PaymentGatewayClient? {
        val client = PaymentGatewayClient()
        client.setEndPoint("https://example.com/")
        client.setPrivateKey("private")
        client.setPublicKey("public")
        return client
    }

    override fun getObjectType(): Class<*>? {
        return PaymentGatewayClient::class.java
    }

}