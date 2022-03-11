package Kotlin.Unit.Test.app

import org.junit.jupiter.api.*

//make display name
@DisplayName("Test with InformationTest")
class InformationTest {
//    make Test
    @Test
//    make Tags
    @Tags(value = [Tag("Test 1"), Tag("Test 2")])
    @DisplayName("Sample Test")
// make function sampleTest
    fun sampleTest(testInfo : TestInfo){
        println(testInfo.displayName) // will return Sample Test
        println(testInfo.tags) // will return Tag("Test 1"), Tag("Test 2")
        println(testInfo.testClass) // will return class InformationTest
        println(testInfo.testMethod) // will return method sampleTest
    }

}