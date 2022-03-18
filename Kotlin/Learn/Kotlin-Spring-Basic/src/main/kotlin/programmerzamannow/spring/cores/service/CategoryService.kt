package programmerzamannow.spring.cores.service

import lombok.Getter
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import programmerzamannow.spring.cores.repository.CategoryRepository
import programmerzamannow.spring.cores.repository.ProductRepository

// add component
@Component
class CategoryService {
//    Dependency Injection with Setter

    //    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)

    @Getter
//    make private variables extend from CategoryRepository
    private var categoryRepository: CategoryRepository = CategoryRepository()

    @Autowired // use Autowired for get priority constructor
//    make setter for categoryRepository but can't use setter
    constructor( categoryRepository: CategoryRepository) {
        log.info("DI setter")
        this.categoryRepository = categoryRepository
    }

//     make getter for categoryRepository
    fun getCategoryRepository(): CategoryRepository {
        return categoryRepository
    }

}