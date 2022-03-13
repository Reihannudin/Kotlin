package Kotlin.Coroutine

import kotlinx.coroutines.*
import org.junit.jupiter.api.Test

class ExceptionHandlingTest {

//    Launch
//    Exception Handler only runs in Launch
    @Test
    fun testExceptionHandlingLaunch(){
//    make error handling with Exception Handler
         val exceptionHandler = CoroutineExceptionHandler { context, throwable ->
             println("Caught : ${throwable.message}")
         }

        runBlocking{
            val job = GlobalScope.launch (exceptionHandler){
                println("Start Coroutines")
                throw IllegalArgumentException("Error")
            }

            job.join()
            println("End Coroutines")
        }
   }

//    Async
    @Test
    fun testExceptionHandlingAsync(){
        runBlocking {
            val deferred = GlobalScope.async {
                println("Start Coroutines")
                throw IllegalArgumentException()
            }
//           make  Error handling with try catch
            try {
                deferred.await()
            } catch (e: IllegalArgumentException) {
                println("Error: Caught Exception")
            } finally{
                println("End Coroutines")
            }
        }
    }
}