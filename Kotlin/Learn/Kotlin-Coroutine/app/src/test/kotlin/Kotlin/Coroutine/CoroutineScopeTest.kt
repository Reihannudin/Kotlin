package Kotlin.Coroutine

import kotlinx.coroutines.*
import org.junit.jupiter.api.Test
import java.util.concurrent.Executors

class CoroutineScopeTest {
//    make test coroutine Scope
    @Test
    fun testScope(){
//        make scope for coroutine and add coroutine context is Dispatchers.IO
        val scope = CoroutineScope(Dispatchers.IO)

//        launch coroutine
        scope.launch {
            delay(1_000)
            println("Run 1 : ${Thread.currentThread().name}")
        }

//    launch coroutine
        scope.launch {
            delay(1_000)
            println("Run 2  : ${Thread.currentThread().name}")
        }

//    runBlocking`
        runBlocking {
            delay(2_000)
            println("Done")
        }
    }

    //    make test cancel coroutine Scope
    @Test
    fun testScopeCancel(){
//        make scope for coroutine and add coroutine context is Dispatchers.IO
        val scope = CoroutineScope(Dispatchers.IO)

//        launch coroutine
        scope.launch {
            delay(2_000)
            println("Run 1 : ${Thread.currentThread().name}")
        }

//    launch coroutine
        scope.launch {
            delay(2_000)
            println("Run 2  : ${Thread.currentThread().name}")
        }

//    runBlocking`
        runBlocking {
            delay(1_000)
            //    cancel coroutine scope
            scope.cancel()
            delay(2_000)
            println("Done")
        }
    }

//    ==========================================================================================

//    make suspend fun foo
    suspend fun foo():Int{
        delay(1_000)
        println("Foo : ${Thread.currentThread().name}")
        return 10
    }
//    make suspend fun bar
    suspend fun bar():Int{
        delay(1_000)
        println("Bar : ${Thread.currentThread().name}")
        return 20
    }
//    make suspend fun sum new
    suspend fun sum(): Int = coroutineScope {
        val foo = async {foo()}
        val bar = async {bar()} //
        foo.await() + bar.await()
    }
//    make suspend fun sum manualy
    suspend fun sumManual():Int {
        val scope = CoroutineScope(Dispatchers.IO)
        val foo = scope.async {foo()}
        val bar = scope.async {bar()}
        return foo.await() + bar.await()
    }

//    make test coroutine scope functions
    @Test
    fun testCoroutineScopeFunctions(){
    val scope = CoroutineScope(Dispatchers.IO)
    val job = scope.launch { // launch coroutine
        val result = sum()
        println("Result : $result")
    }
        runBlocking {
            job.join()
        }
    }

//    ==========================================================================================

    //    make parent and child coroutine scope
//    child coroutine scope will same with parent coroutine scope
    @Test
    fun testParentChildDispatcher(){
//     make Dispatcher
        val dispatcher = Executors.newFixedThreadPool(10).asCoroutineDispatcher()
//    make parent scope
        val scope = CoroutineScope(dispatcher) //add context is dispatcher

//    launch coroutines
        val job = scope.launch{ //launch coroutine
            println("Parent Scope : ${Thread.currentThread().name}")
            coroutineScope{ // child scope
                launch{
                    println("Child Scope : ${Thread.currentThread().name}")
                }
            }
        }
        runBlocking {
            job.join()
        }

    }


    //    make cancel parent and child coroutine scope
//    if cancel parent scope then child scope will cancel
    @Test
    fun testCancelParentChildDispatcher(){
//     make Dispatcher
        val dispatcher = Executors.newFixedThreadPool(10).asCoroutineDispatcher()
//    make parent scope
        val scope = CoroutineScope(dispatcher) //add context is dispatcher

//    launch coroutines
        val job = scope.launch{ // parent scope and launch coroutine
            println("Parent Scope : ${Thread.currentThread().name}")
            coroutineScope{ // child scope
                launch{ // child scope and launch coroutine
                    delay(2_000)
                    println("Child Scope : ${Thread.currentThread().name}")
                }
            }
        }
        runBlocking {
            job.cancelAndJoin()
        }
    }

}


