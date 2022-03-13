package Kotlin.Coroutine

import kotlinx.coroutines.*
import org.junit.jupiter.api.Test
import java.util.*

class TimeoutTest {
//make test without timeout
    @Test
    fun testWithoutTimeout(){
        runBlocking {
            val job = GlobalScope.launch {
                println("Start Coroutine")
                repeat(10){
                    delay(1_000)
                    println("Running $it ${Date()}")
                }
                println("Finished Coroutine")
            }
            job.join()
        }
    }

//    make test with timeout
    @Test
    fun testWithTimeout(){
        runBlocking {
            val job = GlobalScope.launch{
                println("Started Coroutine")
                withTimeout(5_000){ // will throw exception after 5 seconds
                    repeat(10){
                        delay(1_000)
                        println("Running $it ${Date()}")
                    }
                }
                println("Finished Coroutine") // will not be printed
            }
            job.join()
        }
    }

    //    make test with timeout
    @Test
    fun testWithTimeoutOrNull(){
        runBlocking {
            val job = GlobalScope.launch{
                println("Started Coroutine")
                withTimeoutOrNull(5_000){ // will execute coroutines and return only those already executed
                    repeat(10){
                        delay(1_000)
                        println("Running $it ${Date()}")
                    }
                }
                println("Finished Coroutine") // will execute
            }
            job.join()
        }
    }

}