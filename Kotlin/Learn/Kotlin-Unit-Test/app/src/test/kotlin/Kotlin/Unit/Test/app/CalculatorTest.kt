package Kotlin.Unit.Test.app

//import Test
import Kotlin.Unit.Test.app.generator.SimpleDisplayNameGenerator
import org.junit.jupiter.api.*
//import assertions
import org.junit.jupiter.api.Assertions.*
//inport Test Aborted Exception
import org.opentest4j.TestAbortedException
//import Assumptions
import org.junit.jupiter.api.Assumptions
import org.junit.jupiter.api.Assumptions.assumeTrue

//assertions antisipation if the test fails
//display name is used to name the test
//test Aborted Exception is used to abort the test
//assumption is used to skip the test

//add display name
//@DisplayName("Test for calculator class")

//add display name generator
@DisplayNameGeneration(SimpleDisplayNameGenerator::class)
//auto display for every function don't have display name

class CalculatorTest {

//    before and after all will be executed before and after all the test
    companion object{
//        before all test
        @BeforeAll
        @JvmStatic
        fun beforeAll(){
            println("before all")
        }
//        after all test
        @AfterAll
        @JvmStatic
        fun afterAll(){
            println("after all")
        }
    }
//    make variable extend Calculator class
    val calculator = Calculator()

//    before and after test in exceute in every function
//    before every test
    @BeforeEach
    fun beforeEach() {
        println("Before each test")
    }
//    after every test
    @AfterEach
    fun afterEach() {
        println("after each test")
    }

//    add @Test annotation to test method
//    testing Sum Function
//add display name
//@DisplayName("Test for function calculator add(10,20)")
    @Test
    fun sumTest(){
        val resultSum = calculator.sum(10,20)
//    Assertions equals
        assertEquals(30, resultSum, "Sum is not correct")
        println("Sum result is $resultSum")
    }

//    add @Test annotation to test method
//    testing Subtract Function
//add display name
//@DisplayName("Test for function calculator sub(40,5)")
    @Test
    fun subTest(){
        val resultSub = calculator.sub(40,5)
//    Assertions equals
        assertEquals(35, resultSub, "Subtract is not correct")
        println("Sub result is $resultSub")
    }
//    add @Test annotation to test method
//    testing Multiply Function
//add display name
@DisplayName("Test for function calculator mul(4,2)")
    @Test
    fun mulTest(){
        val resultMultiply = calculator.mul(4,2)
//    Assertions equals
        assertEquals(8, resultMultiply, "Multiply is not correct")
        println("Multiply result is $resultMultiply")
    }

//    add @Test annotation to test method
//    testing Div Function if they succeed
//add display name
@DisplayName("Test for function calculator div Success (40,2)")
    @Test
    fun divTestSuccess(){
        val resultDiv = calculator.div(40,2)
//    Assertions equals
        assertEquals(20, resultDiv, "Div is not correct")
        println("Div result is Success $resultDiv")
    }

//    add @Test annotation to test method
//    testing Div Function if they error
//add display name
@DisplayName("Test for function calculator div Success (40,0)")
@Test
    fun divTestFail(){
//    Assertions throws Exception
        assertThrows<IllegalArgumentException>{
            calculator.div(40,0)
        }
    }

//    Disabled test for ignoring test
    @Disabled("in process")
    @Test
    fun testComingSoon() {
//     // Not Clear
    }

//    Cancelled test with AbortedException
    @Test
    fun testAborted(){
//    to set to be succeed you should add the value in environment variable first
//    if not there in environment wil be cancelled
        val profile = System.getenv()["PROFILE"]
        if ("Dev" != profile){
            throw  TestAbortedException("Test Aborted")
        }
    println("Test Success")
    }

//    cancelled test with assumption
    @Test
    fun testAssumption(){
//    to set to be succeed you should add the value in environment variable first
//    if not there in environment wil be cancelled
        assumeTrue("Dev" == System.getenv("PROFILE"))
        println("Test Success")
    }
}
