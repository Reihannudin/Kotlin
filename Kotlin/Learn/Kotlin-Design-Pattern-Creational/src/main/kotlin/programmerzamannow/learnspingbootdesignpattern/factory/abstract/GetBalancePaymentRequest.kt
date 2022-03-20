package programmerzamannow.learnspingbootdesignpattern.factory.abstract


interface GetBalancePaymentRequest {
    fun getUserId(): String?

    fun setUserId(userId: String?)

    fun getMethod(): PaymentMethod?
}