package Kotlin.Coroutine

import kotlinx.coroutines.*
import org.junit.jupiter.api.Test
import java.util.concurrent.Executors

class CoroutineContextTest {
//    add experimental
    @ExperimentalStdlibApi
//    make test
    @Test
    fun testCoroutineContext(){
        runBlocking {
            val job = GlobalScope.launch{
                val context = coroutineContext // coroutine context uses to store elements
                println("CoroutineContext: $context")
                println("CoroutineContext: ${context[Job]}")
                println("CoroutineContext: ${context[CoroutineDispatcher]}")
            }
        }
    }

//   make test coroutine name
    @Test
    fun testCoroutineName(){
        val scope = CoroutineScope(Dispatchers.IO)
    val job = scope.launch(CoroutineName("Parent")){ // add name in coroutine
        println("CoroutineName: ${coroutineContext[CoroutineName]} run in thread ${Thread.currentThread().name}")
        withContext(CoroutineName("Child")){ // add name in withContext
            println("CoroutineName: ${coroutineContext[CoroutineName]} run in thread ${Thread.currentThread().name}")
        }
    }
    runBlocking {
        job.join()
    }
    }


    @Test
    fun testCoroutineAddElement(){
//        make Dispatchers
        val dispatchers = Executors.newFixedThreadPool(10).asCoroutineDispatcher()
        val scope = CoroutineScope(Dispatchers.IO + CoroutineName("Coroutine Test"))// add elemnet default name coroutine
        val job = scope.launch(CoroutineName("Parent") + dispatchers){ // add new element dispatcher
            println("CoroutineName: ${coroutineContext[CoroutineName]} run in thread ${Thread.currentThread().name}")
            withContext(CoroutineName("Child") + Dispatchers.IO){ // add to back dispatcher IO
                println("CoroutineName: ${coroutineContext[CoroutineName]} run in thread ${Thread.currentThread().name}")
            }
        }
        runBlocking {
            job.join()
        }
    }

}