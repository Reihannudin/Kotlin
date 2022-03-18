package programmerzamannow.spring.cores

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import programmerzamannow.spring.cores.service.MerchantServiceImpl

//add Configurations
@Configuration
//import MerchantServiceImpl
@Import(MerchantServiceImpl::class)
class InheritanceConfiguration {
}