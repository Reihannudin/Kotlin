package programmerzamannow.spring.cores

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import programmerzamannow.spring.cores.data.Car
import programmerzamannow.spring.cores.prossesor.IdGeneratorBeanProsessor

class BeanPostProssesorTest {

    //     make nested class
//     add configuration
    @Configuration
    @Import(value = [ // import class
        Car::class,
        IdGeneratorBeanProsessor::class
    ])
    class TestConfiguration{
    }

    // make test
    @Test
    fun testCar(){
//         make context
        val context = AnnotationConfigApplicationContext(TestConfiguration::class.java)
        context.registerShutdownHook() // closed context

//        get bean car
        var car = context.getBean(Car::class.java)
        println("Id : ${car.getId()}")

//        assertion
        Assertions.assertNotNull(car)
    }


}