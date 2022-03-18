package programmerzamannow.spring.cores.prossesor

import org.slf4j.LoggerFactory
import org.springframework.beans.BeansException
import org.springframework.beans.factory.config.BeanPostProcessor
import org.springframework.core.Ordered
import org.springframework.stereotype.Component
import programmerzamannow.spring.cores.aware.IdAware
import java.util.*

//add component
@Component
class PrefixIdGeneratorBeanProsessor: BeanPostProcessor, Ordered { // implement BeanPostProcessor
    //    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)

    override fun getOrder(): Int {
        return 2
    }

    @Throws(BeansException::class) // throws BeansException
    override fun postProcessAfterInitialization(bean: Any, beanName: String): Any { // make override function with two parameter
        log.info("Prefix Id Generator Prosessor for Bean : $beanName")
        if(bean is IdAware){ // Checking if bean is IdAware
            log.info("Prefix Set Id Generator for Bean : $beanName")
            val idAware : IdAware = bean as IdAware // make idAware variable with bean
            idAware.setId("PZN- "+ idAware.getId()) // set id
        }
        return bean
    }


}