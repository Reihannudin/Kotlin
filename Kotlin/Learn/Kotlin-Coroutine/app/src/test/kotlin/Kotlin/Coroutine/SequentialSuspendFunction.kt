package Kotlin.Coroutine

import kotlinx.coroutines.*
import org.junit.jupiter.api.Test
import java.util.concurrent.Executors

import java.util.concurrent.Executors.newFixedThreadPool
import kotlin.system.measureTimeMillis

class SequentialSuspendFunction {

//    make suspend function getFoo
    suspend fun getFoo(): Int {
        delay(1_000)
        return 10
    }

//    make suspend function getBar
    suspend fun getBar(): Int {
        delay(1_000)
        return 20
    }

//    test suspend function running as sequential
    @Test
    fun testSuspendSequential(){
        runBlocking{
            val time = measureTimeMillis {
                getFoo()
                getBar()
            }
            println("time: $time")
        }
    }

    //    test suspend function running as sequential with coroutine
    @Test
    fun testSuspendSequentialCororutine(){
        runBlocking{
            val job = GlobalScope.launch{
                val time = measureTimeMillis {
                    getFoo()
                    getBar()
                }
                println("time: $time")
            }
            job.join()
        }
    }

    //    test suspend function running as concurrent but can't return value coroutines
    @Test
    fun testSuspendConcurrentCoroutine(){
        runBlocking{
            val time = measureTimeMillis{
                val job1 = GlobalScope.launch { getFoo() }
                val job2 = GlobalScope.launch { getBar() }

                joinAll(job1, job2)
            }
            println("time: $time")
        }
    }

    //    make suspend function runJob
    suspend fun runJob(number: Int){
        println("Start job : $number in thread ${Thread.currentThread().name}")
        yield() // yield to other coroutine
        println("End job : $number in thread ${Thread.currentThread().name}")
    }

    //    Test
    @Test
    fun testYieldFunction(){
//        make dispatcher
        val dispatcher = Executors.newFixedThreadPool(10).asCoroutineDispatcher()
//        make scope
        val scope = CoroutineScope(dispatcher)

        runBlocking{ // run blocking
            scope.launch { runJob(1) } // launch runJob 1
            scope.launch { runJob(2) } // launch runJob 2

            delay(2_000)
        }
    }


}

