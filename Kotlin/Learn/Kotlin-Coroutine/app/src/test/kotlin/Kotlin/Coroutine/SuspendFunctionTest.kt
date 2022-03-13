package Kotlin.Coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import java.util.*

class SuspendFunctionTest {

//    make suspend function
    suspend fun helloWorld(){
        println("Hello : ${Date()} : ${Thread.currentThread().name}")
        delay(2_000) // delay 2 seconds
        println("World : ${Date()} : ${Thread.currentThread().name}")
    }

//    make test suspend function
    @Test
    fun testSuspendFunction(){
        runBlocking { // use run blocking if want running suspend function (But this is not recommended)
            helloWorld() // call suspend function
        }
    }

}