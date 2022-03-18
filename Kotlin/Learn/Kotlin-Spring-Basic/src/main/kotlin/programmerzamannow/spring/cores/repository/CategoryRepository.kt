package programmerzamannow.spring.cores.repository

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

// add Component
@Component
class CategoryRepository {
    //    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)
    fun log(){
        log.info("CategoryRepository")
    }

}