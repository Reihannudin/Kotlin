package Kotlin.Coroutine

import kotlinx.coroutines.*
import org.junit.jupiter.api.Test
import kotlin.system.measureTimeMillis

class AsyncTest {
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

//    make test coroutines with Async running as concurrent and can return value coroutines
    @Test
    fun testAsync(){
        runBlocking { // this: CoroutineScope
            val time = measureTimeMillis { // show running time
                val foo: Deferred<Int> = GlobalScope.async { getFoo() } // coroutines with async for running async
                                                                        // and can return with Deferred<Int>
                val bar: Deferred<Int> = GlobalScope.async { getBar() } // coroutines with async for running async
                                                                        // and can return with Deferred<Int>

                val result = foo.await() + bar.await() // await for get value from coroutines
                println("result: $result") // print result
            }
            println("time: $time") // print time
        }
    }

    //    make test coroutines with Async running as concurrent and can return value coroutines
    @Test
    fun testAsyncAwaitAll(){
        runBlocking { // this: CoroutineScope
            val time = measureTimeMillis { // show running time
                val foo: Deferred<Int> = GlobalScope.async { getFoo() } // coroutines with async for running async
                // and can return with Deferred<Int>
                val bar: Deferred<Int> = GlobalScope.async { getBar() } // coroutines with async for running async
                // and can return with Deferred<Int>

                val result = awaitAll(foo, bar).sum() // awaitAll for get all value and use sum() from collection
                println("result: $result") // print result
            }
            println("time: $time") // print time
        }
    }

}







