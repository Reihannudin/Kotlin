/*
 * This Kotlin source file was generated by the Gradle "init" task.
 */
package Kotlin.Unit.Test.app

//import Junit.framework.TestCase
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class MessageUtilsTest {
// make test from class MessageUtil
    @Test fun testGetMessage() {
        println("Ini test")
        assertEquals("Hello      World!", MessageUtils.getMessage())
        assertNotNull(MessageUtils.sayHello(), "sayHello should not be null")
    }


}