package programmerzamannow.spring.cores.service

import lombok.Getter
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import programmerzamannow.spring.cores.repository.ProductRepository

// yaou also can add
// addlazy Lazy
// addScope Scope("prototype")

//add components
@Component // component register as a new bean
class ProductionService {
    //    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)

//     make dependency injection with component
    //  define producRepository as a property and make getter
    @Getter
    private var productRepository: ProductRepository = ProductRepository()

//    Dependency Injection Constructor
//     to add multiple constructor dependency injection
    @Autowired // use Autowired for get priority constructor
    //    make constructor ProductService
    constructor(productRepository: ProductRepository) {
        log.info("Constructor 1")
        this.productRepository = productRepository
    }

    //    make constructor ProductService
    constructor(productRepository: ProductRepository, number : Int = 2) {
        val number: String  = number.toString()
        log.info("Constructor ${number}")
        this.productRepository = productRepository
    }

    //    make getter productRepository
    fun getProductRepository(): ProductRepository {
        return productRepository
    }


}