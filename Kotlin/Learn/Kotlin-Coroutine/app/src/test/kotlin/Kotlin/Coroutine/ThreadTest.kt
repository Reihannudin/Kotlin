package Kotlin.Coroutine

import org.junit.jupiter.api.Test
import java.util.*
import kotlin.concurrent.thread

class ThreadTest {

//    Show thread test
    @Test
    fun showThreadName() {
    val threadName = Thread.currentThread().name
        println("Thread name: $threadName")
    }

//    make single thread
//    Thread running as parallel not sequential
    @Test
    fun testSingleThread(){
//    JAVA THREAD
//        val runnable = Runnable { // runnable used to write applications which can run in a separate thread
//            println(Date()) // print date
//            Thread.sleep(2000) // will sleep for 2 seconds
//            println("Finish : ${Date()}") // print date
//        }
//
//        val thread = Thread(runnable) // create thread plus add runnable
//        thread.start() // start Thread

//    KOTLIN THREAD
          thread(start = true) { // start thread
              println(Date()) // print date
              Thread.sleep(2000) // will sleep for 2 seconds
              println("Finish : ${Date()}") // print date
          }

        println("Waitting for thread to finish")
        Thread.sleep(3000) // will sleep for 3 seconds
        println("FINISH")
    }

//    make multiple thread
    @Test
    fun testMultipleThread(){
        val thread1 = Thread(Runnable{ // create thread
            println(Date()) // print date
            Thread.sleep(2000) // will sleep for 2 seconds
            println("Finish Thread 1 : ${Thread.currentThread().name} : ${Date()}") // print date
        })
        val thread2 = Thread(Runnable{
            println(Date())
            Thread.sleep(2000)
            println("Finish Thread 2 : ${Thread.currentThread().name} : ${Date()}")
        })

        thread1.start()// start thread
        thread2.start()

        println("Waitting for thread to finish")
        Thread.sleep(3000)
        println("FINISH")
    }

}