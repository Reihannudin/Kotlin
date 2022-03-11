package Kotlin.Unit.Test.app

import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

// Tag for make microservices tests
@Tag("intergrations-sample-test")
class SampleIntergrationsTest {
    @Test
    fun test_sample1() {
        println("Hello, world1")
    }
    @Test
     fun test_sample2() {
         println("Hello, world2")
     }
}