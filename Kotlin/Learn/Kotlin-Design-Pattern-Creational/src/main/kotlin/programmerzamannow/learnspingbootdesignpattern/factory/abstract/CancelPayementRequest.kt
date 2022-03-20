package programmerzamannow.learnspingbootdesignpattern.factory.abstract


interface CancelPayementRequest {
    fun getId(): String?

    fun setId(id: String?)

    fun getMethod(): PaymentMethod?
}