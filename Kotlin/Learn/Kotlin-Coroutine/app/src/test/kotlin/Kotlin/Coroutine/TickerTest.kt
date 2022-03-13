package Kotlin.Coroutine

import com.google.common.base.Ticker
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.channels.ticker
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import java.util.*

class TickerTest {
//    make test timers with ticker
    @Test
    fun testTicker(){
//    make ticker with value 1 second
        val receiverChannels = ticker(delayMillis = 1_000)
        runBlocking {
            val job = launch{
                repeat(10){
                    receiverChannels.receive()
                    println("numTick: ${it} Date release: ${Date()}")
                }
            }
        }
    }

//     manually test timmers
    @Test
    fun testTimers(){
        val receiverChannels = GlobalScope.produce<String?> {
            repeat(10){
                delay(1_000)
                send(null)
            }
        }
    runBlocking {
        val job = launch {
            repeat(10){
                receiverChannels.receive()
                println("numTick: ${it} Date release: ${Date()}")
            }
        }
    }
    }
}







