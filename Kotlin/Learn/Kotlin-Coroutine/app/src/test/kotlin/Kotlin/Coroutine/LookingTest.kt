package Kotlin.Coroutine

import com.google.common.util.concurrent.Striped.semaphore
import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.sync.withPermit
import org.junit.jupiter.api.Test

import java.util.concurrent.Executors

class LookingTest {

//    make looking Test
    @Test
    fun testRaceCondition(){
//        make counter
        var counter: Int = 0
//    make dispatcher
    val dispatcher = Executors.newFixedThreadPool(10).asCoroutineDispatcher()
//    make scope
    val scope = CoroutineScope(dispatcher)

//    make looking
    repeat(100){
        scope.launch {
            repeat(1_000) {
                counter++
            }
        }
    }

    //    runblocking
    runBlocking {
        delay(5_000)
        println("Total counter : $counter")

    }
    }

// saving data mutable with Mutex
    //    make looking Test with mutex
    @Test
    fun testRaceConditionwithMutex(){
//        make counter
        var counter: Int = 0
//    make dispatcher
        val dispatcher = Executors.newFixedThreadPool(10).asCoroutineDispatcher()
//    make scope
        val scope = CoroutineScope(dispatcher)
//        make mutex
        val mutex = Mutex()

//    make looking with mutex
        repeat(100){
            scope.launch {
                repeat(1_000) {
                    mutex.withLock{
                        counter++
                    }
                }
            }
        }

        //    runblocking
        runBlocking {
            delay(5_000)
            println("Total counter with mutex : $counter")

        }
    }

    // saving data mutable with Semaphore
    // if want to running more coroutines you can use semaphore and edit permits like you want
    //    make looking Test with Semaphore
    @Test
    fun testRaceConditionwithSemaphore(){
//        make counter
        var counter: Int = 0
//    make dispatcher
        val dispatcher = Executors.newFixedThreadPool(10).asCoroutineDispatcher()
//    make scope
        val scope = CoroutineScope(dispatcher)
//        make semaphore
        val semaphore = Semaphore(permits = 2)

//    make looking with mutex
        repeat(100){
            scope.launch {
                repeat(1_000) {
                    semaphore.withPermit {
                        counter++
                    }
                }
            }
        }

        //    runblocking
        runBlocking {
            delay(5_000)
            println("Total counter with semaphore : $counter")

        }
    }
}










