package programmerzamannow.learnspingbootdesignpattern.factory.abstract.creditcard

import lombok.Getter
import lombok.Setter
import programmerzamannow.learnspingbootdesignpattern.factory.*
import programmerzamannow.learnspingbootdesignpattern.factory.abstract.ChargePaymentRequest
import programmerzamannow.learnspingbootdesignpattern.factory.abstract.PaymentMethod


class CreditCardChargePaymentRequest : ChargePaymentRequest {

    private lateinit var id: String
    override fun getId(): String? {
        return id
    }
    override fun setId(id: String?) {
        this.id = id!!
    }

    private var amount: Long =0L
    override fun getAmount(): Long? {
        return amount
    }
    override fun setAmount(amount: Long?) {
        this.amount = amount!!
    }


    override fun getFee(): Long {
        return getAmount()!! * 5 / 100
    }

    override fun getMethod(): PaymentMethod {
        return PaymentMethod.CREDIT_CARD
    }
}
