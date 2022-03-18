package programmerzamannow.spring.cores

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import programmerzamannow.spring.cores.service.MerchantService
import programmerzamannow.spring.cores.service.MerchantServiceImpl

class InheritanceTest {
    @Test
    fun testInheritance(){
//        make context
        val context = AnnotationConfigApplicationContext(InheritanceConfiguration::class.java)
        context.registerShutdownHook()

//        get bean
        val merchantService = context.getBean(MerchantService::class.java)
        val merchantServiceImpl = context.getBean(MerchantServiceImpl::class.java)

//         make assertions
        Assertions.assertSame(merchantService, merchantServiceImpl)

    }

}