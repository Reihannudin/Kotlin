package programmerzamannow.spring.cores.service

import org.springframework.beans.factory.BeanNameAware
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.stereotype.Component

@Component
class AuthService : ApplicationContextAware, BeanNameAware {

    private var beanName : String = ""

    private var applicationContext: ApplicationContext?  = null

//     make getter for beanName
    fun getBeanName(): String {
        return beanName
    }

//     make getter for applicationContext
    fun getApplicationContext(): ApplicationContext? {
        return applicationContext
    }

    override fun setApplicationContext(applicationContext: ApplicationContext) {
        this.applicationContext = applicationContext
    }

    override fun setBeanName(name: String) {
        this.beanName = name
    }
}