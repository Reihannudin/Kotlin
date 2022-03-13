package Kotlin.Coroutine

import kotlinx.coroutines.*
import org.junit.jupiter.api.Test
import java.util.*

class CancellableCoroutineTest {
//    make test
    @Test
    fun testCannotCancel(){
        runBlocking{ // this: CoroutineScope
            val job = GlobalScope.launch{ // launch a new coroutine in the scope of runBlocking
                println("Start coroutine ${Date()}")
                Thread.sleep(2000) // sleep for 2 seconds use Thread.sleep
                println("End coroutine ${Date()}")
            }
            job.cancel()// cancels the job
            delay(3000) // delay 3 seconds to ensure it does not execute
        }
    }

    //    make test
    @Test
    fun testCancellable(){
        runBlocking{ // this: CoroutineScope
            val job = GlobalScope.launch{ // launch a new coroutine in the scope of runBlocking
                if(!isActive) throw CancellationException("Cancelled") // validate if coroutine is active
                println("Start coroutine ${Date()}")

                ensureActive() // validate if coroutine is active
                Thread.sleep(2000) // sleep for 2 seconds use Thread.sleep

                ensureActive() // validate if coroutine is active
                println("End coroutine ${Date()}")
            }
            job.cancel()// cancels the job
            delay(3000) // delay 3 seconds to ensure it does not execute
        }
    }

    //    make test
    @Test
    fun testCancellableFinaly(){
        runBlocking{ // this: CoroutineScope
            val job = GlobalScope.launch{ // launch a new coroutine in the scope of runBlocking
                try {
                    println("Start coroutine ${Date()}")
                    delay(2_000) // sleep for 2 seconds use Thread.sleep
                    println("End coroutine ${Date()}")
                } finally { // finally block is always executed
                    println("Finally")
                }
            }
            job.cancelAndJoin()// cancels the job and join
        }
    }
}