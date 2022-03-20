package programmerzamannow.learnspingbootdesignpattern.factory.abstract

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext




@SpringBootTest(classes = [AbstractFactoryApplication::class])
class AbstractFactoryApplicationTest {

    @Autowired
    lateinit var context : ApplicationContext


    @Test
    fun testAbstractFactory(){
        val paymentFactoryCreditCard = context.getBean(CreditCardPaymentFactory::class.java)
        val paymentFactoryBcaKlikPay = context.getBean(BcaClickPaymentFactory::class.java)
        val paymentFactoryGopay = context.getBean(GopayPaymentFactory::class.java)

        charge(paymentFactoryCreditCard)
        charge(paymentFactoryBcaKlikPay)
        charge(paymentFactoryGopay)
      }

    fun charge(paymentFactory: PaymentFactory){
        val payment = paymentFactory.createChargeRequest()
        payment.setId("xxx")
        payment.setAmount(100_000_000L)
        /*
         *  kirim ke payment gateway
         * */
        println(payment.toString())
    }

    fun cancel(paymentFactory: PaymentFactory){
        val cancelPayment = paymentFactory.cancelPayementRequest()
        cancelPayment.setId("xxx")
        /*
        * kirim ke payment gateway
        * */
        println(cancelPayment.toString())
    }

    fun getBalance(paymentFactory: PaymentFactory): Long {
        try{
        val getBalance = paymentFactory.createGetBalancePaymentRequest()
        getBalance.setUserId("xxx")
        println(getBalance.toString())
        /*
        * kirim ke payment gateway
        * */
        return 2000L;
        }catch (UnsupportedOperationException: Exception){
            return 0L;
        }
    }
}