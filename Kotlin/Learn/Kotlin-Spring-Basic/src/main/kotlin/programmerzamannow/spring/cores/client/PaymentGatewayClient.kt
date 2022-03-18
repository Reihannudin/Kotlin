package programmerzamannow.spring.cores.client

import lombok.Data

@Data
class PaymentGatewayClient {
//    make private endPoint
    private var endPoint: String? = ""
//    make private privateKey
    private var privateKey: String? = ""
//    make private publicKey
    private var publicKey: String? = ""

//    make getter for endPoint
    fun getEndPoint(): String? {
        return endPoint
    }
//    make getter for privateKey
    fun getPrivateKey(): String? {
        return privateKey
    }

//    make getter for publicKey
    fun getPublicKey(): String? {
        return publicKey
    }


//     make setter for endPoint
    fun setEndPoint(endPoint: String) {
        this.endPoint = endPoint
    }

//    make setter for privateKey
    fun setPrivateKey(privateKey: String) {
        this.privateKey = privateKey
    }

//     make setter for publicKey
    fun setPublicKey(publicKey: String) {
        this.publicKey = publicKey
    }


}