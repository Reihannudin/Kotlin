package Kotlin.Coroutine

import org.junit.jupiter.api.Test
import java.util.concurrent.Executor
import java.util.*
import java.util.concurrent.Executors

class ExecutorServiceTest {

//  SingleThreadPool will only create one thread
    @Test
    fun testSingleThreadPool(){
        val executorService = Executors.newSingleThreadExecutor()
        //we don't need to create thread because threads are created automatically in executorService
        repeat(10){ // repeat 10 times
            val runnable = Runnable { // running runnable
                Thread.sleep(1000)
                println("Finish $it ${Thread.currentThread().name} ${Date()}")
            }
            executorService.execute(runnable) // submit runnable to executorService
            println("Add runnable $it")
        }
        println("Waitting...")
        Thread.sleep(11000)
        println("Done")
    }

//    FixThreadPool will create a thread as defined or needed
    @Test
    fun testFixThreadPool(){
        val executorService = Executors.newFixedThreadPool(3)
        //we don't need to create thread because threads are created automatically in executorService
        repeat(10){ // repeat 10 times
            val runnable = Runnable { // running runnable
                Thread.sleep(1000)
                println("Finish $it ${Thread.currentThread().name} ${Date()}")
            }
            executorService.execute(runnable) // submit runnable to executorService
            println("Add runnable $it")
        }
        println("Waitting...")
        Thread.sleep(11000)
        println("Done")
    }

//    CacheThreadPool will make thread according to the queue size
    @Test
    fun testCacheThreadPool(){
        val executorService = Executors.newCachedThreadPool()
        //we don't need to create thread because threads are created automatically in executorService
        repeat(10){ // repeat 10 times
            val runnable = Runnable { // running runnable
                Thread.sleep(1000)
                println("Finish $it ${Thread.currentThread().name} ${Date()}")
            }
            executorService.execute(runnable) // submit runnable to executorService
            println("Add runnable $it")
        }
        println("Waitting...")
        Thread.sleep(11000)
        println("Done")
    }
}