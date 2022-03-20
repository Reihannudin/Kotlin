package programmerzamannow.learnspingbootdesignpattern.factory.abstract


interface ChargePaymentRequest {
    fun getId(): String?

    fun setId(id: String?)

    fun getAmount(): Long?

    fun setAmount(amount: Long?)

    fun getFee(): Long?

    fun getMethod(): PaymentMethod?
}