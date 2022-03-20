package programmerzamannow.learnspingbootdesignpattern.factory.abstract.creditcard

import programmerzamannow.learnspingbootdesignpattern.factory.abstract.CancelPayementRequest
import programmerzamannow.learnspingbootdesignpattern.factory.abstract.PaymentMethod

class CreditCardCancelPaymentRequest: CancelPayementRequest {
    private lateinit var id : String
    override fun getId(): String? {
        return id
    }
    override fun setId(id: String?) {
        this.id = id!!
    }

    override fun getMethod(): PaymentMethod? {
        return PaymentMethod.CREDIT_CARD
    }

}