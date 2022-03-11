package Kotlin.Unit.Test.app

import org.junit.jupiter.api.*

//    Default lifcycle every Test will be Indepentent or PER_METHOD
//@TestInstance(value = TestInstance.Lifecycle.PER_METHOD)

//    Change lifecycle to PER_CLASS and every Test will be conection with other Test
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)

//make custome Order Test if want to run test in specific order shoud use <OrderAnnotation>
@TestMethodOrder(value = MethodOrderer.OrderAnnotation::class)
class OrderTest {

//    make variable counter
    var counter: Int = 0

//  the advantage of using PER_CLASS can use beforeAll and afterAll
//    make function beforeAll methods
    @BeforeAll
    fun beforeAll() {
        println("beforeAll")
    }
//    make function afterAll methods
    @AfterAll
    fun afterAll() {
        println("afterAll")
    }

//    make custome Order Test
    @Test
    @Order(2)
    fun testA(){
    println("testA")
    counter++
    println("counter A: $counter")
    println("counter Hashcode A: ${this.hashCode()}")
    }


//    make custome Order Test
    @Test
    @Order(3)
    fun testB(){
    println("testB")
    counter++
    println("counter B: $counter")
    println("counter Hashcode B: ${this.hashCode()}")
    }

//    make custome Order Test
    @Test
    @Order(1)
    fun testC() {
    println("testC")
    counter++
    println("counter C $counter")
    println("counter HashcodeC : ${this.hashCode()}")
    }

//    The test Should be 1.testC 2.testA 3.testB }
}
