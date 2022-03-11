package Kotlin.Unit.Test.app

import Kotlin.Unit.Test.app.resolver.RandomParameterResolver
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.ValueSource
import java.util.*

//defedencies injection

//Extend RandomParameterResolver
//@Extensions(value = [ExtendWith(RandomParameterResolver::class)])

//make class RandomCalculatorTest
//class RandomCalculatorTest extend ParentCalculatorTest
class RandomCalculatorTest : ParentCalculatorTest() {
//    make private val calculator
//    private val calculator = Calculator()

    //    make Test
    @Test
//make functions random with defedencies injected Random
    fun testRandom(random: Random) {
//    define first
        val first = random.nextInt(1000)
        println("first: $first")
//    define second
        val second = random.nextInt(1000)
        println("second: $second")
//    define result
        val result = calculator.sum(first, second)
        println("result: $result")
//    assertEquals result
        assertEquals(first + second, result)
    }

//make repeatTest
    @DisplayName("Test calculator with random parameters")
//    to make repeatTest you should add RepeatTest
    @RepeatedTest(
        value = 10,
        name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
//def fun testRandomRepeat
//if u want repeatations in output you should add RepetitionInfo
//if u want add the displayName in out functions you can use TestInfo
    fun testRandomRepeat(random: Random, repetitionInfo: RepetitionInfo, testInfo: TestInfo) {
//    print repetitionInfo
    println("${testInfo.displayName} ke ${repetitionInfo.currentRepetition} dari ${repetitionInfo.totalRepetitions}")
//    define first
    val first = random.nextInt(1000)
    println("first: $first")
//    define second
    val second = random.nextInt(1000)
    println("second: $second")
//    define result
    val result = calculator.sum(first, second)
    println("result: $result")
//    assertEquals result
    assertEquals(first + second, result)
}

//    Test With Parameters
//    with @ValueSource
//    display name
    @DisplayName("Test Calculator with random parameters")
//    naming paramters
    @ParameterizedTest(name = "{displayName} with data {0}")
//    make value
    @ValueSource(ints = [10, 20, 30, 40, 50])
//make function with parameters
    fun testWithParameters(value: Int) {
//    make statement
      val result = calculator.sum(value, value)
                    assertEquals(value + value, result)
                    println(result)
            }
//    with @MethodSource
//    make companion object
    companion object {
//        add JVMStatic and make functions for implemenr in test
        @JvmStatic
        fun parameterWithSource(): List<Int>{
            return listOf(10, 20, 30, 40, 50)
        }
    }
    @ParameterizedTest
//    make value with source method parameterWithSource
    @MethodSource(value = ["parameterWithSource"])
//    make function testWithMethodSource
    fun testWithMethodSource(value: Int) {
//        statement
        val result = calculator.sum(value, value)
        assertEquals(value + value, result)
        println(result)
    }

}
