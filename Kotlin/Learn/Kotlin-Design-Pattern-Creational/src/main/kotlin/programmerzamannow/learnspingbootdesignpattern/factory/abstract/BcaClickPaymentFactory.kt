package programmerzamannow.learnspingbootdesignpattern.factory.abstract

import org.springframework.context.annotation.Configuration
import programmerzamannow.learnspingbootdesignpattern.factory.abstract.bcaclick.BcaCancelPaymentRequest
import programmerzamannow.learnspingbootdesignpattern.factory.abstract.bcaclick.BcaClickChargePaymentRequest
import programmerzamannow.learnspingbootdesignpattern.factory.abstract.bcaclick.BcaClickGetBalancePaymentRequest

@Configuration
class BcaClickPaymentFactory: PaymentFactory {
    override fun createChargeRequest(): ChargePaymentRequest {
        return BcaClickChargePaymentRequest()
    }

    override fun cancelPayementRequest(): CancelPayementRequest {
        return BcaCancelPaymentRequest()
    }

    override fun createGetBalancePaymentRequest(): GetBalancePaymentRequest {
        return BcaClickGetBalancePaymentRequest()
    }
}