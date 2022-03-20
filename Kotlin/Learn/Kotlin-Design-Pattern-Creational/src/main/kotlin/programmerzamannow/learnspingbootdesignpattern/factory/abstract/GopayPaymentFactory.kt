package programmerzamannow.learnspingbootdesignpattern.factory.abstract

import org.springframework.context.annotation.Configuration
import programmerzamannow.learnspingbootdesignpattern.factory.abstract.gopay.GopayCancelPaymentRequest
import programmerzamannow.learnspingbootdesignpattern.factory.abstract.gopay.GopayChargePaymentRequest
import programmerzamannow.learnspingbootdesignpattern.factory.abstract.gopay.GopayGetBalancePaymentRequest

@Configuration
class GopayPaymentFactory: PaymentFactory {
    override fun createChargeRequest(): ChargePaymentRequest {
        return GopayChargePaymentRequest()
    }

    override fun cancelPayementRequest(): CancelPayementRequest {
        return GopayCancelPaymentRequest()
    }

    override fun createGetBalancePaymentRequest(): GetBalancePaymentRequest {
        return GopayGetBalancePaymentRequest()
    }
}