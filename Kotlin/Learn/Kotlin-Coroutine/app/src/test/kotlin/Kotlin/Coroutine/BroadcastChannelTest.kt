package Kotlin.Coroutine

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.BroadcastChannel
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import kotlinx.coroutines.channels.broadcast
import org.junit.jupiter.api.Test

// broadcastChannel for  make reciver more than one

class BroadcastChannelTest {
//    make test BroadcastChannel
    @Test
    fun testBroadcastChannel(){
//         make broadcast channel
        val broadcastChannel = BroadcastChannel<Int>(capacity = 10)

//    make recivers
        val reciver1 = broadcastChannel.openSubscription()
        val reciver2 = broadcastChannel.openSubscription()

//     make scope
        val scope = CoroutineScope(Dispatchers.IO)

//     make coroutines job send
    val jobSend = scope.launch {
        repeat(10) {
            broadcastChannel.send(it)
        }
    }

//     make coroutines job recive
    val jobReciver1 = scope.launch {
        repeat(10) {
            println("reciver1: ${reciver1.receive()}")
        }
    }
//     make coroutines job recive
    val jobReciver2 = scope.launch {
        repeat(10) {
            println("reciver2: ${reciver2.receive()}")
        }
    }
    runBlocking {
        joinAll(jobSend, jobReciver1, jobReciver2)
        }
    }

        @Test
        fun testBroadcastChannelFunction(){
//     make scope
            val scope = CoroutineScope(Dispatchers.IO)

////     make broadcast channel manually
//            val broadcastChannel = BroadcastChannel<Int>(capacity = 10)
////     make coroutines job send
//            val jobSend = scope.launch {
//                repeat(10) {
//                    broadcastChannel.send(it)
//                }
//            }

////     make broadcast channel with broadcast in coroutine scope
            val broadcastChannel = scope.broadcast<Int>(capacity = 10)  {
                repeat(10){
                    send(it)
                }
            }

//    make recivers channels
            val reciver1 = broadcastChannel.openSubscription()
            val reciver2 = broadcastChannel.openSubscription()

//     make coroutines job recive
            val jobReciver1 = scope.launch {
                repeat(10) {
                    println("reciver1: ${reciver1.receive()}")
                }
            }
//     make coroutines job recive
            val jobReciver2 = scope.launch {
                repeat(10) {
                    println("reciver2: ${reciver2.receive()}")
                }
            }
            runBlocking {
                joinAll( jobReciver1, jobReciver2)
            }
        }


//    make test conflatedBroadcastChannel
    @Test
    fun testConflatedBroadcastChannel(){
//       make conflated broadcast channel
        val conflatedBroadcastChannel = ConflatedBroadcastChannel<Int>()
//    make receive channels
        val reciverChannel = conflatedBroadcastChannel.openSubscription()
//    make scope
        val scope = CoroutineScope(Dispatchers.IO)
//    make job send
        val jobSend = scope.launch {
            repeat(10) {
                delay(1_000)
                println("send: ${it}")
                conflatedBroadcastChannel.send(it)
            }
        }
//    make job recive
        val jobReciver = scope.launch{
            repeat(10) {
                delay(2_000)
                println("reciver: ${reciverChannel.receive()}")
            }
        }
//     make runblocking
       runBlocking {
           delay(11_000)
            scope.cancel()
        }

    }




}