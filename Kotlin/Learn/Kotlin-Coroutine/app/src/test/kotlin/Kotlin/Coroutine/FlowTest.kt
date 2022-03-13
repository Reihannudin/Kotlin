package Kotlin.Coroutine


import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import org.junit.jupiter.api.Test
import java.util.*

class FlowTest {
//    make test flowTest
    @Test
    fun testFlow(){
//        make flow
        val flow1 : Flow<Int> = flow{
            println("Start Flow")
            repeat(100){
                println("Emit : $it")
                emit(it) // emit for input value
            }
        }
        runBlocking {
            flow1.collect{ // collect for output value
                println("Collect : $it")
            }
            println("Done")
        }
    }

//    operator Flow
//    make suspend function flow
    suspend fun numberFlow(): Flow<Int> = flow {
        repeat(100) {
           emit(it)
        }
    }
//    make suspend function flow String
    suspend fun changeToString(number: Int): String{
        delay(100)
        return "Number : $number"
    }
//    make test operator flow
    @Test
    fun testOperatorFlow(){
        runBlocking{ // runBlocking for suspend function
            val flow2 = numberFlow() // get from suspend function
            flow2.filter { it % 2 == 0 } // filter output value
                .map { changeToString(it) } // map for output value
                .collect { println(it) } // running flow
        }
        }

    //make exception flow Test
    @Test
    fun testFlowException(){
        runBlocking { // runBlocking for suspend function
            numberFlow()
                .map { check(it < 10); it } // map for output value
                .onEach { println(it) }
                .catch { println("Error ${it.message}") } // catch for exception
                .onCompletion { println("Done") } // onCompletion for finish
                .collect() // collect for running flow
        }
    }

//    make cancellable flow
    @Test
    fun testCancellableFlow(){
        val scope = CoroutineScope(Dispatchers.IO)
        runBlocking{
            val job = scope.launch{
                numberFlow()
                    .onEach {
                        if (it > 10) cancel() // cancel for output value
                        else println(it)
                    }
                    .collect()
            }
            job.join()
        }
    }

//     make test SharedFlow
    @Test
    fun testSharedFlow(){
//     make scope
        val scope = CoroutineScope(Dispatchers.IO)
//     make SharedFlow with use MutableSharedFlow
        val sharedFlow = MutableSharedFlow<Int>()

//    make job send
       scope.launch { // launch coroutines for send
           repeat(10){
               println("  Send  : $it ,Date release : ${Date()}")
               sharedFlow.emit(it) // use emit to send value
               delay(1_000)
           }
       }
//    make job receive
       scope.launch { // launch coroutines for receive
           sharedFlow.asSharedFlow() // use asSharedFlow to receive value
               .buffer(10) // add buffer
               .map { "Receive 1 : $it ,Date release : ${Date()}" }
               .collect {
                   delay(1_000)
                   println(it)
               }
       }
    //    make job receive
    scope.launch { // launch coroutines for receive
        sharedFlow.asSharedFlow() // use asSharedFlow to receive value
            .buffer(10) // add buffer
            .map { "Receive 2 : $it ,Date release : ${Date()}" }
            .collect {
                delay(2_000)
                println(it)
            }
       }
//     make runBlocking
        runBlocking {
            delay(22_000)
            scope.cancel()
        }
    }


    //     make test StateFlow
    @Test
    fun testStateFlow(){
//     make scope
        val scope = CoroutineScope(Dispatchers.IO)
//     make SharedFlow with use MutableSharedFlow
        val stateFlow = MutableStateFlow<Int>(value = 0)

//    make job send
        scope.launch { // launch coroutines for send
            repeat(10){
                println("  Send  : $it ,Date release : ${Date()}")
                stateFlow.emit(it) // use emit to send value
                delay(1_000)
            }
        }

        //    make job receive
        scope.launch { // launch coroutines for receive
            stateFlow.asSharedFlow() // use asSharedFlow to receive value
                .map { "Receive : $it ,Date release : ${Date()}" }
                .collect {
                    println(it)
                    delay(5_000)
                }
        }
//     make runBlocking
        runBlocking {
            delay(22_000)
            scope.cancel()
        }
    }



}


