package programmerzamannow.spring.cores

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.config.CustomScopeConfigurer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Scope
import programmerzamannow.spring.cores.data.Bar
import programmerzamannow.spring.cores.data.Foo
import programmerzamannow.spring.cores.scope.DoubletoneScope

//Add Configuration
@Configuration
class ScopeConfiguration {
    //    make logging configuration
    private val log = LoggerFactory.getLogger(this.javaClass)
//     add bean
    @Bean
//    @Scope("singleton") // (Default) Only created once in Spring IoC
    @Scope("prototype") //Always create a new object every time the bean is accessed
    fun foo(): Foo {
        log.info("Create new Foo")
        return Foo()
    }

//    =====================================================
//    Register Scope DoubleTone
     @Bean
     fun customScopeConfigurer(): CustomScopeConfigurer {
         val configurer = CustomScopeConfigurer()
         configurer.addScope("doubleton", DoubletoneScope())
         return configurer
     }

//    define bean and use scope doubleton
    @Bean
    @Scope("doubleton")
    fun bar(): Bar{
        log.info("Create new Bar")
        return Bar()
    }

}