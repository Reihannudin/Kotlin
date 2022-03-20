package programmerzamannow.learnspingbootdesignpattern.factory.abstract.bcaclick

import programmerzamannow.learnspingbootdesignpattern.factory.abstract.GetBalancePaymentRequest
import programmerzamannow.learnspingbootdesignpattern.factory.abstract.PaymentMethod

class BcaClickGetBalancePaymentRequest : GetBalancePaymentRequest{
    private lateinit var userId: String
    override fun getUserId(): String? {
        return userId
    }
    override fun setUserId(userId: String?) {
        this.userId = userId!!
    }

    override fun getMethod(): PaymentMethod? {
        return PaymentMethod.BCA_CLICK
    }
}