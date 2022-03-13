package Kotlin.Coroutine

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.selects.select
import org.junit.jupiter.api.Test

class SelectTest {
//     make test who is the fast
    @Test
    fun testSelectDeferred(){
//         make scope
        val scope = CoroutineScope(Dispatchers.IO)

//     make deferred coroutines
        val deferred1 = scope.async {
            delay(2000)
            2000
        }
        val deferred2 = scope.async {
            delay(3000)
            3000
        }
        val deferred3 = scope.async {
            delay(1000)
            1000
        }

//    make job coroutines
    val job = scope.launch{
        val win = select<Int>{
            deferred1.onAwait { it }
            deferred2.onAwait {it}
            deferred3.onAwait {it}
        }
        println("win is $win")
    }
    runBlocking{
        job.join()
    }
    }


        //     make test who is the fast
        @Test
        fun testSelectChannel() {
//         make scope
            val scope = CoroutineScope(Dispatchers.IO)

//     make deferred coroutines
            val receiveChannel1 = scope.produce {
                delay(2000)
                send(2000)
            }
            val receiveChannel2 = scope.produce {
                delay(3000)
                send(3000)
            }
            val receiveChannel3 = scope.produce {
                delay(1000)
                send(1000)
            }

//    make job coroutines
            val job = scope.launch {
                val win = select<Int> {
                    receiveChannel1.onReceive { it }
                    receiveChannel2.onReceive { it }
                    receiveChannel3.onReceive { it }
                }
                println("win is $win")
            }
            runBlocking {
                job.join()
            }
        }

    @Test
    fun testSelectChannelAndDeferred() {
//         make scope
        val scope = CoroutineScope(Dispatchers.IO)

//     make deferred coroutines
        val receiveChannel1 = scope.produce {
            delay(2000)
            send(2000)
        }
        val deferred2 = scope.async {
            delay(1000)
            1000
        }
        val receiveChannel3 = scope.produce {
            delay(2000)
            send(2000)
        }

//    make job coroutines
        val job = scope.launch {
            val win = select<Int> {
                receiveChannel1.onReceive { it }
                deferred2.onAwait{ it }
                receiveChannel3.onReceive { it }
            }
            println("win is $win")
        }
        runBlocking {
            job.join()
        }
    }
}
