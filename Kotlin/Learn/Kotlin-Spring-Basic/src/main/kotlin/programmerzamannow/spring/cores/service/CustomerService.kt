package programmerzamannow.spring.cores.service

import lombok.Getter
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component
import programmerzamannow.spring.cores.repository.CategoryRepository
import programmerzamannow.spring.cores.repository.CustomerRepository

@Component
class CustomerService {

    //    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)

    @Autowired
    @Qualifier("normalCustomerRepository")
    private var normalCustomerRepository: CustomerRepository = CustomerRepository()

    @Autowired
    @Qualifier("premiumCustomerRepository")
    private var premiumCustomerRepository: CustomerRepository = CustomerRepository()

    fun getCustomerRepository(type: String): CustomerRepository {
        return when (type) {
            "normal" -> normalCustomerRepository
            "premium" -> premiumCustomerRepository
            else -> throw IllegalArgumentException("Invalid customer type")
        }
    }
}