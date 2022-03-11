package Kotlin.Unit.Test.app

import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class NestedTest {
    @Test
    fun testA(){
        println("testA")
    }

//    make inner class
//    and to running the nested test should add Nested in a top class
    @Nested
    inner class MyNestedTest {
        @Test
        fun testB(){
            println("testB")
        }
    }
}