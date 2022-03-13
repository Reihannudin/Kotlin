package Kotlin.Coroutine

import kotlinx.coroutines.*
import org.junit.jupiter.api.Test

class JobTest {

    //    Add Coroutine inside runBlocking
    @Test
    fun testJobWrong() {
        runBlocking { // this: CoroutineScope
            GlobalScope.launch {// launch a new coroutine in background and continue
                delay(2_000) // wait for 2 seconds
                println(
                    "Coroutine Done ${Thread.currentThread().name}" // not printed
                )
            }
        }
    }

    //    Lazy
    //    Add Coroutine inside runBlocking
    @Test
    fun testJobSucces() {
        runBlocking { // this: CoroutineScope
            val job: Job = GlobalScope.launch(start = CoroutineStart.LAZY) { // make job with start = CoroutineStart.LAZY
                delay(2_000) // wait for 2 seconds
                println(
                    "Coroutine Done ${Thread.currentThread().name}" // printed
                )
            }
            job.start() // start the job
            println("Waitting...")
            delay(3_000) // wait for 1 second
            println("Done")
        }
    }

    //    Join
    //    Add Coroutine inside runBlocking
    @Test
    fun testWaitJob() {
        runBlocking { // this: CoroutineScope
            val job: Job = GlobalScope.launch { // launch a new coroutine \
                delay(2_000) // wait for 2 seconds
                println(
                    "Coroutine Done ${Thread.currentThread().name}" // printed
                )
            }
            println("Waitting...")
            job.join() // wait for job to complete
            println("Done")
        }
    }

    //    Cancel a job
    //    Add Coroutine inside runBlocking
    @Test
    fun testCancelJob() {
        runBlocking { // this: CoroutineScope
            val job: Job = GlobalScope.launch { // launch a new coroutine in background and cancel
                delay(2_000) // wait for 2 seconds
                println(
                    "Coroutine Done ${Thread.currentThread().name}" // printed
                )
            }
            job.cancel() // cancel the job
            println("Waitting...")
            delay(3_000) // wait for 1 second
            println("Done")
        }
    }

    //  JoinALl
    //    Add Coroutine inside runBlocking
    @Test
    fun testJoinAllJob() {
        runBlocking { // this: CoroutineScope
            val job1: Job = GlobalScope.launch { // launch a new coroutine \
                delay(2_000) // wait for 2 seconds
                println(
                    "Coroutine Job1 Done ${Thread.currentThread().name}" // printed
                )
            }
            val job2: Job = GlobalScope.launch { // launch a new coroutine \
                delay(2_000) // wait for 2 seconds
                println(
                    "Coroutine Job2 Done ${Thread.currentThread().name}" // printed
                )
            }
            println("Waitting...")
            joinAll(job1, job2) // join all coroutines
            println("Done")
        }
    }

}