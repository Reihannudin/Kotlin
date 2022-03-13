package Kotlin.Coroutine

import kotlinx.coroutines.*
import org.junit.jupiter.api.Test
import java.util.concurrent.Executors

class SupervisorJobTest {

//    make testing Job
//    Behavior Job : if there 1 error on child job, all child and parent job will be canceled
    @Test
    fun testJob (){
        val dispatcher = Executors.newFixedThreadPool(10).asCoroutineDispatcher() // make dispatcher
        val scope = CoroutineScope(dispatcher + Job()) // make scope

//     make job 1
        val job1 = scope.launch{
            delay(2_000)
            println("job1")
        }
        val job2 = scope.launch{
            delay(1_000)
            throw IllegalArgumentException("Job 2 is Failed")
        }

    runBlocking {
        joinAll(job1, job2)
    }
    }



    //    make testing SupervisorJob
//    Behavior SupervisorJob : if there error on child job, all child and parent job will be executed
    @Test
    fun testSupervisorJob (){
        val dispatcher = Executors.newFixedThreadPool(10).asCoroutineDispatcher() // make dispatcher
        val scope = CoroutineScope(dispatcher + SupervisorJob()) // make scope

//     make job 1
        val job1 = scope.launch{
            delay(2_000)
            println("job1")
        }
        val job2 = scope.launch{
            delay(1_000)
            throw IllegalArgumentException("Job 2 is Failed")
        }

        runBlocking {
            joinAll(job1, job2)
        }
    }

//    make test supervisorScope
//    Behavior SupervisorScope : if there error on child scope, all child and parent scope will be executed
    @Test
    fun testSupervisorScope(){
//        make dispatcher
        val dispatcher = Executors.newFixedThreadPool(10).asCoroutineDispatcher()
//        make scope wit job
        val scope = CoroutineScope(dispatcher + Job())

//    runBlocking
        runBlocking {
            scope.launch{ // parent coroutines
                supervisorScope{ //supervisorScope
                    launch { // child coroutines
                        delay(2_000)
                        println("job1")
                    }
                    launch { // child coroutines
                        delay(1_000)
                        throw IllegalArgumentException("Job 2 is Failed")
                    }
                }
            }
            delay(3_000)
        }
    }

//   if want use exceptionHandler you should use in parent coroutines
//    if want use in child u can use supervisorScope
//    make test job exeption handler
    @Test
    fun testJobExceptionHandler(){
//         make exeption handler
        val exceptionHandler = CoroutineExceptionHandler { context, throwable ->
            println("Exception handled: ${throwable.message}")
        }
//    make dispatcher
        val dispatcher = Executors.newFixedThreadPool(10).asCoroutineDispatcher()
//    make scope
        val scope = CoroutineScope(dispatcher + Job())

//    runBlocking
        runBlocking {
            val job = scope.launch {  // if want to use exception handler, must in here
                launch(exceptionHandler) { // wrong exception, launch child coroutines with exception handler this is not use
                    println("job Child")
                    throw  IllegalArgumentException("Job Child is Error")
                }
            }
            job.join() // wait for job
        }
    }

    //    make test SupervisorJobjob exeption handler
    @Test
    fun testSupervisorScopeExceptionHandler(){
//         make exeption handler
        val exceptionHandler = CoroutineExceptionHandler { context, throwable ->
            println("Exception handled: ${throwable.message}")
        }
//    make dispatcher
        val dispatcher = Executors.newFixedThreadPool(10).asCoroutineDispatcher()
//    make scope
        val scope = CoroutineScope(dispatcher + SupervisorJob())

//    runBlocking
        runBlocking {
            val job = scope.launch {  // if want to use exception handler, must in here
                supervisorScope{
                    launch(exceptionHandler) {  // will use bcs of supervisorScope you can use in child coroutines again
                        println("job Child")
                        throw  IllegalArgumentException("Job Child is Error")
                    }
                }
            }
            job.join() // wait for job
        }
    }

}















