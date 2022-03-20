package programmerzamannow.learnspingbootdesignpattern.factory.abstract.creditcard

import programmerzamannow.learnspingbootdesignpattern.factory.abstract.GetBalancePaymentRequest
import programmerzamannow.learnspingbootdesignpattern.factory.abstract.PaymentMethod

class CreditCardGetBalancePaymentRequest : GetBalancePaymentRequest{
    private lateinit var userId: String
    override fun getUserId(): String? {
        return userId
    }
    override fun setUserId(userId: String?) {
        this.userId = userId!!
    }

    override fun getMethod(): PaymentMethod? {
        return PaymentMethod.CREDIT_CARD
    }
}