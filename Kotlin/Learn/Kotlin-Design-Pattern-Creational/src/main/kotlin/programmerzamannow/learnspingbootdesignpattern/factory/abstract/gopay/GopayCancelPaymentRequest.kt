package programmerzamannow.learnspingbootdesignpattern.factory.abstract.gopay

import programmerzamannow.learnspingbootdesignpattern.factory.abstract.CancelPayementRequest
import programmerzamannow.learnspingbootdesignpattern.factory.abstract.PaymentMethod

class GopayCancelPaymentRequest: CancelPayementRequest {
    private lateinit var id : String
    override fun getId(): String? {
        return id
    }
    override fun setId(id: String?) {
        this.id = id!!
    }

    override fun getMethod(): PaymentMethod? {
        return PaymentMethod.GOPAY
    }

}