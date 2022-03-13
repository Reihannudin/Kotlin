package Kotlin.Coroutine

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.actor
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

class ActorTest {
//     make test actor
    @Test
    fun testActor(){
//         make scope
        val scope = CoroutineScope(Dispatchers.IO)

//         make properties send Channel with actor
        val sendChannels = scope.actor<Int>(capacity = 10){
            repeat(10){
                println("Actor receive ${receive()}")
            }
        }

//      make job receive
        val job = scope.launch {
            repeat(10){
                sendChannels.send(it)
            }
        }
     runBlocking { job.join() }
    }
}











