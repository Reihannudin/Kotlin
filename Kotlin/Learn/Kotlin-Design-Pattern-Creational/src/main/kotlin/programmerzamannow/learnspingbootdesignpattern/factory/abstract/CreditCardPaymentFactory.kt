package programmerzamannow.learnspingbootdesignpattern.factory.abstract

import org.springframework.context.annotation.Configuration
import programmerzamannow.learnspingbootdesignpattern.factory.abstract.creditcard.CreditCardCancelPaymentRequest
import programmerzamannow.learnspingbootdesignpattern.factory.abstract.creditcard.CreditCardChargePaymentRequest

@Configuration
class CreditCardPaymentFactory : PaymentFactory {
    override fun createChargeRequest(): ChargePaymentRequest {
        return CreditCardChargePaymentRequest()
    }

    override fun cancelPayementRequest(): CancelPayementRequest {
        return CreditCardCancelPaymentRequest()
    }

    override fun createGetBalancePaymentRequest(): GetBalancePaymentRequest {
        throw UnsupportedOperationException("Get balance is not supported in credit card.")
    }
}