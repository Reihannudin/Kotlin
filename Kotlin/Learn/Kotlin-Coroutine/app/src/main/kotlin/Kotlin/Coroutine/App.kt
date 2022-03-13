/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package Kotlin.Coroutine

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)

//    show thread info
    val threadName = Thread.currentThread().name
    println("Thread name: $threadName")
}