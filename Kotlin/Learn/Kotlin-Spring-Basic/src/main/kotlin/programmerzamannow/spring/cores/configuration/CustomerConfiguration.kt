package programmerzamannow.spring.cores.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import programmerzamannow.spring.cores.repository.CustomerRepository

// add Configuration
@Configuration
class CustomerConfiguration {

//     make Bean
    @Primary
    @Bean
    fun normalCustomerRepository(): CustomerRepository {
        return CustomerRepository()
    }

//     make Bean
    @Bean
    fun premiumCustomerRepository(): CustomerRepository {
        return CustomerRepository()
    }
}