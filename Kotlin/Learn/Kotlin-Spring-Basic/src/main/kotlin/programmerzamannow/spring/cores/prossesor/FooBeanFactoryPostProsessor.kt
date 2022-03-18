package programmerzamannow.spring.cores.prossesor

import org.springframework.beans.BeansException
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory
import org.springframework.beans.factory.support.BeanDefinitionRegistry
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor
import org.springframework.beans.factory.support.GenericBeanDefinition
import org.springframework.stereotype.Component
import programmerzamannow.spring.cores.data.Foo

@Component
class FooBeanFactoryPostProsessor : BeanDefinitionRegistryPostProcessor {

    @Throws(BeansException::class)
    override fun postProcessBeanDefinitionRegistry(registry: BeanDefinitionRegistry){
        val definition = GenericBeanDefinition()
        definition.setScope("singleton")
        definition.setBeanClass(Foo::class.java)

//        registry
        registry.registerBeanDefinition("foo", definition)

    }

    override fun postProcessBeanFactory(beanFactory: ConfigurableListableBeanFactory) {
//        nothing
    }

}