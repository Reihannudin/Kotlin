package programmerzamannow.spring.cores

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import programmerzamannow.spring.cores.repository.CategoryRepository
import programmerzamannow.spring.cores.repository.CustomerRepository
import programmerzamannow.spring.cores.repository.ProductRepository
import programmerzamannow.spring.cores.service.CategoryService
import programmerzamannow.spring.cores.service.CustomerService
import programmerzamannow.spring.cores.service.ProductionService

class ComponentTest {
//     make Test
    @Test
    fun testComponent() {
//        make context
        val context = AnnotationConfigApplicationContext(ComponentConfiguration::class.java)
//        closed context
        context.registerShutdownHook()

//    get bean component
        val component1 = context.getBean(ProductionService::class.java)
        val component2 = context.getBean("productionService",ProductionService::class.java)

//       assertion
        Assertions.assertSame(component1,component2)
    }

//    make test constructorDependencyInjection
    @Test
    fun testConstructorDependencyInjection() {
        //        make context
        val context = AnnotationConfigApplicationContext(ComponentConfiguration::class.java)
        //        closed context
        context.registerShutdownHook()
//     get bean component productService
        val productService = context.getBean(ProductionService::class.java)
//    get bean productRepository
        val productRepository = context.getBean(ProductRepository::class.java)
//    assertion
        Assertions.assertSame(productRepository, productService.getProductRepository())
    }

    //    make test setterDependencyInjection
    @Test
    fun testSetterDependencyInjection() {
        //        make context
        val context = AnnotationConfigApplicationContext(ComponentConfiguration::class.java)
        //        closed context
        context.registerShutdownHook()

//     get bean component categoryService
        val categoryService = context.getBean(CategoryService::class.java)
//    get bean CategoryRepository
        val categoryRepository = context.getBean(CategoryRepository::class.java)
        //    assertion
        Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository())
    }

//    Test DependencyInjectionCustomer
    @Test
    fun testDependencyInjectionCustomer() {
        //        make context
        val context = AnnotationConfigApplicationContext(ComponentConfiguration::class.java)
        //        closed context
        context.registerShutdownHook()

//      make Customer service and get bean from Class CustomerService
        val customerService = context.getBean(CustomerService::class.java)

//      get bean CustomerRepository and name it to normal Customer
        val normalCustomerRepository = context.getBean("normalCustomerRepository",CustomerRepository::class.java)
//      get bean CustomerRepository and name it to premium Customer
        val premiumCustomerRepository = context.getBean("premiumCustomerRepository",CustomerRepository::class.java)

//      assertion
        Assertions.assertSame(normalCustomerRepository, customerService.getCustomerRepository("normal"))
        Assertions.assertSame(premiumCustomerRepository, customerService.getCustomerRepository("premium"))

        }


}