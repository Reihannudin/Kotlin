package programmerzamannow.learnspingbootdesignpattern.factory.abstract

interface PaymentFactory {
    fun createChargeRequest() : ChargePaymentRequest

    fun cancelPayementRequest() : CancelPayementRequest

    fun createGetBalancePaymentRequest() : GetBalancePaymentRequest
}