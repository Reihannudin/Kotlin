package programmerzamannow.learnspingbootdesignpattern.factory.abstract.bcaclick

import programmerzamannow.learnspingbootdesignpattern.factory.abstract.CancelPayementRequest
import programmerzamannow.learnspingbootdesignpattern.factory.abstract.PaymentMethod

class BcaCancelPaymentRequest: CancelPayementRequest {
    private lateinit var id : String
    override fun getId(): String? {
        return id
    }
    override fun setId(id: String?) {
        this.id = id!!
    }

    override fun getMethod(): PaymentMethod? {
        return PaymentMethod.BCA_CLICK
    }

}