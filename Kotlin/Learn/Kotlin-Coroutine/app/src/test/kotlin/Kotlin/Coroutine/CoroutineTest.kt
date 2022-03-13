package Kotlin.Coroutine

import kotlinx.coroutines.*
import org.junit.jupiter.api.Test
import java.util.*

class CoroutineTest {
//    make suspend function
    suspend fun hello(){
        delay(1000) //delay for 1 second
        println("Hello World") // print if function workd
    }
//    make coroutines test
    @Test
    fun coroutinesTest() {
//    make coroutines shoud add GlobalScope.launch
    GlobalScope.launch {  // launch coroutines
        // code coroutines
        hello() // call function
    }
    println("Waitting...") // print if function works
    runBlocking {  // use run blocking if want running suspend function (But this is not recommended)
        delay(2000) // delay for 2 second
    }
    println("Done") // print if function works
    }

    //    make coroutines test
//    Coroutine is light weight thread
    @Test
    fun coroutinesTestMany() {
        repeat(10_000){ // repeat 10_000 times
            //    make coroutines shoud add GlobalScope.launch
            GlobalScope.launch { // launch coroutines
                delay(1000) // delay for 1 second
                println("Done : $it : ${Date()} : ${Thread.currentThread().name}") // print if function works
            }
        }
        println("Waitting...") // print if function works
        runBlocking { // use run blocking if want running suspend function (But this is not recommended)
            delay(3000) // delay for 3 second
        }
        println("Done") // print if function works
    }

//make child and parrent coroutines child
//    parrent coroutines will wait child coroutines
    @Test
    fun testCoroutineParentChild(){
        runBlocking{
            val job = GlobalScope.launch{ // parent coroutines
                launch{  // child coroutines
                    delay(2000)
                    println("Child 1 coroutine")
                }
                launch{ // child coroutines
                    delay(4000)
                    println("Child 2 coroutine")
                }
                delay(1000)
                println("Parent coroutine")
            }
            job.join() // wait for parent coroutines

        }
    }

//    make test running coroutines but cancel child coroutines
    @Test
    fun testCoroutineCancelChildern() {
        runBlocking {
            val job = GlobalScope.launch { // parent coroutines
                launch {  // child coroutines
                    delay(2000)
                    println("Child 1 coroutine")
                }
                launch {  // child coroutines
                    delay(4000)
                    println("Child 2 coroutine")
                }
                delay(1000)
                println("Parent coroutine")
            }
            job.cancelChildren() // cancel child coroutines
            job.join() // wait for parent coroutines

        }
    }

//        make test awaitCancellation
        @Test
        fun testAwaitCancellation() {
            runBlocking{
                val job = launch {
                    try {
                        println("Job Start")
                        awaitCancellation() // awaitCancellation will wait for cancel
                    } finally{
                        println("Job Finished")
                    }
                }
                delay(5000)
                println("Cancelling Job")
                job.cancelAndJoin()
            }
        }


















}