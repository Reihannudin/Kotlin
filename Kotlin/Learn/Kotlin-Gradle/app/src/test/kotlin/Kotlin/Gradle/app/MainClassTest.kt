package Kotlin.Gradle.app

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

//Make Unit tests from file MainClass.kt
class MainClassTest {
    @Test
    fun testMainClassTest() {
        val classUnderTest = MainClass()
        assertNotNull(classUnderTest.gretting, "App should have a greeting")
        assertEquals(classUnderTest.gretting, "Hello world!")
    }
}