package Kotlin.Coroutine

import kotlinx.coroutines.*
import org.junit.jupiter.api.Test
import java.util.concurrent.Executors

class CoroutineDispatcherTest {

//    make test Dispatchers default v IO
    @Test
    fun testDispatcher(){
        runBlocking {
            println("runBlocking ${Thread.currentThread().name}")
            val job1 = GlobalScope.launch(Dispatchers.Default) { //Dispatchers.Default, this is the default dispatcher,
                println("job1 : ${Thread.currentThread().name}") // containing at least 2 threads, or as many as the
                                                                 // number of cpu (whichever is more).
            }
            val job2 = GlobalScope.launch(Dispatchers.IO) { //Dispatcher.IO, this is a dispatcher that contains threads
                println("job2 : ${Thread.currentThread().name}") // as needed, when they are needed they are created,
                                                                 // when they are no longer needed, they are deleted.
            }
            joinAll(job1, job2) // wait for all jobs to complete
        }
    }

    //    make test Dispatchers Unconfined v Confined
//    Dispatchers Unconfined and Confined, this is a dispatcher that does not designate any thread,
//    usually will continue the thread in the previous coroutine
    @Test
    fun testDispatcherConfined(){
        runBlocking{
            println("runBlocking ${Thread.currentThread().name}")
//            Unconfined can mutually change threads
            GlobalScope.launch(Dispatchers.Unconfined) { //
                println("Unconfined : ${Thread.currentThread().name}")
                delay(1000)
                println("Unconfined : ${Thread.currentThread().name}")
                delay(1000)
            }
//            Confined can not be changed thread or once set the thread will stay the same forever
            GlobalScope.launch {
                println("Confined : ${Thread.currentThread().name}")
                delay(1000)
                println("Confined : ${Thread.currentThread().name}")
                delay(1000)
            }
            delay(2000)
        }
    }

//    make custom Dispatchers
    @Test
    fun testOwnDispatchers() {
        val dispatcherService = Executors.newFixedThreadPool(10).asCoroutineDispatcher() // create a dispatcher
        val dispatcherAndroid = Executors.newSingleThreadExecutor().asCoroutineDispatcher() //`create a dispatcher

        runBlocking{
           val jobService = GlobalScope.launch(dispatcherService) { //add dispatcher service to the coroutine
               println("jobService : ${Thread.currentThread().name}")
           }
           val jobAndroid = GlobalScope.launch(dispatcherAndroid) { //add dispatcher android to the coroutine
               println("jobAndroid : ${Thread.currentThread().name}")
           }
           joinAll(jobService, jobAndroid) //`wait for all jobs to complete
       }
    }

//    // Switch thread with (WithContext)
    @Test
    fun testDispatcherWithContext(){
        val dispatcherClient = Executors.newFixedThreadPool(10).asCoroutineDispatcher()
        runBlocking{
            val job = GlobalScope.launch(Dispatchers.IO){ //thread Dispatchers IO
                println("step 1 : ${Thread.currentThread().name}")
                withContext(dispatcherClient){ // switch to dispatcherClient
                    println("step 2 : ${Thread.currentThread().name}")
                }
                println("step 3 : ${Thread.currentThread().name}") // back to Dispatchers IO
            }
            job.join() // wait for job to complete
        }
    }

//    make Test Cancelable Job
    @Test
    fun testCancellabeJob(){
        runBlocking {
            val job = GlobalScope.launch {
                try{
                    println("Start Job")
                    delay(1000)
                    println("End Job")
                } finally {
                    println(isActive) //false
                    delay(1000)
                    println("Finnaly") // not printed bcs job is cancelled
                }
            }
            job.cancelAndJoin() // cancel job and wait for it to complete
        }
    }

    //    make Test Cancelable Job
    @Test
    fun testNonCancellabeJob(){
        runBlocking {
            val job = GlobalScope.launch {
                try{
                    println("Start Job")
                    delay(1000)
                    println("End Job")
                } finally {
                    withContext(NonCancellable){ // NonCancellable is a context that can not be cancelled
                        println(isActive) //True
                        delay(1000)
                        println("Finnaly") // will be printed bcs job is True now
                    }
                }
            }
            job.cancelAndJoin() // cancel job and wait for it to complete
        }
    }
}