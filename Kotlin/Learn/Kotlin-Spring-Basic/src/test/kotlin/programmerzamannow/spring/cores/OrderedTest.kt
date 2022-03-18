package programmerzamannow.spring.cores

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import programmerzamannow.spring.cores.data.Car
import programmerzamannow.spring.cores.prossesor.IdGeneratorBeanProsessor
import programmerzamannow.spring.cores.prossesor.PrefixIdGeneratorBeanProsessor

class OrderedTest {

//     make nested class
    @Configuration
    @Import(value = [
        Car::class,
        IdGeneratorBeanProsessor::class,
        PrefixIdGeneratorBeanProsessor::class
    ])
    class TestConfiguration{

    }

    //         make Test
    @Test
    fun testCar(){
        val context = AnnotationConfigApplicationContext(TestConfiguration::class.java)
        context.registerShutdownHook()

        val car = context.getBean(Car::class.java)
        println(car)
        Assertions.assertTrue(car.getId().startsWith("PZN-"))
    }
}