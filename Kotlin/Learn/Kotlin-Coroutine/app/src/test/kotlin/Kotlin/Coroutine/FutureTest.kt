package Kotlin.Coroutine

import org.junit.jupiter.api.Test
import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.Future
import kotlin.system.measureTimeMillis

class FutureTest {
//    define variables executorService
val executorService = Executors.newFixedThreadPool(5)


    //    make fun foo with type data Int
    fun getFoo() : Int{
        Thread.sleep(1000) // sleep for 1000 ms
        return 10 // return 10
    }
//    make fun bar with type data Int
    fun getBar() : Int{
        Thread.sleep(1000) // sleep for 1000 ms
        return 20 // return 20
    }

//    Make test non parallel
    @Test
    fun testNonParallel(){
        val time = measureTimeMillis {
            val foo = getFoo() // get foo Int
            val bar = getBar() // get bar Int
            val result = foo + bar // add foo and bar
            println("Result is $result") // print result
        }
        println("Total time is $time") // print time taken
    }

//    make test parallel with future
    @Test
    fun testParallel(){
        val time = measureTimeMillis {
            val foo : Future<Int> = executorService.submit(Callable { getFoo() }) // submit getFoo
            val bar : Future<Int> = executorService.submit(Callable { getBar() }) // submit getBar
//            foo and bar are now futures
            val result = foo.get() + bar.get() // add foo and bar
            println("Result is $result") // print result
        }
        println("Total time is $time") // print time taken
    }
}



