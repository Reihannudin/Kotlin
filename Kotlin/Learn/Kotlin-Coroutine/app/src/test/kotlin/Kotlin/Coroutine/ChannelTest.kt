package Kotlin.Coroutine

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import org.junit.jupiter.api.Test


class ChannelTest {

//     make test channel
    @Test
    fun testChannel(){
        runBlocking{ // runBlocking allows to launch coroutines in the current thread
//            make channel with generic Int
            val channel = Channel<Int>()
//            make coroutines 1
            val job1 = launch{
//                send data to channel
                println("send data 1 to channel")
                channel.send(1)
                println("send data 2 to channel")
                channel.send(2)
            }

//            make coroutines 2
            val job2 = launch{
                // receive data from channel
                println("receive data ${channel.receive()} from channel")
                println("receive data ${channel.receive()} from channel")
            }

            joinAll(job1, job2) // wait for all coroutines to finish
            channel.close() // close channel    `
        }
    }

    //     make test channel
    @Test
    fun testChannelBufferUnlimited() {
        runBlocking{ // runBlocking allows to launch coroutines in the current thread
//            make channel with generic Int
            val channel = Channel<Int>(capacity = Channel.UNLIMITED) //this is capacity buffer you can setting to
//                                       Channel.UNLIMITED = 2 bilion , Channel.BUFFERED= 64, Channel.RENDEZVOUS = 0
//            make coroutines 1
            val job1 = launch{
//                send data to channel
                println("send data 1 to channel")
                channel.send(1)
                println("send data 2 to channel")
                channel.send(2)
//                repeat(100){
//                    println("send data $it to channel")
//                    channel.send(it)
//                }
            }

//            make coroutines 2
            val job2 = launch{
                // receive data from channel
                println("receive data ${channel.receive()} from channel")
                println("receive data ${channel.receive()} from channel")
            }

            joinAll(job1, job2) // wait for all coroutines to finish
            channel.close() // close channel    `
        }
    }


    //     make test channel
    @Test
    fun testChannelBufferConflated() {
        runBlocking{ // runBlocking allows to launch coroutines in the current thread
//            make channel with generic Int
            val channel = Channel<Int>(capacity = Channel.CONFLATED) //this is capacity is -1 Conflated only can send one data
                                                                     // and will be return the last data of channel
//            make coroutines 1
            val job1 = launch{
//                send data to channel
//                println("send data 1 to channel")
//                channel.send(1)
//                println("send data 2 to channel")
//                channel.send(2)
                repeat(100){
                    println("send data $it to channel")
                    channel.send(it)
                }
            }
            job1.join()

//            make coroutines 2
            val job2 = launch{
                // receive data from channel
                println("receive data ${channel.receive()} from channel")
                println("receive data ${channel.receive()} from channel")
            }
            job2.join()

            joinAll(job1, job2) // wait for all coroutines to finish
            channel.close() // close channel    `
        }
    }

    //     make test channel
    @Test
    fun testChannelBufferOverflow() {
        runBlocking{ // runBlocking allows to launch coroutines in the current thread
//            make channel with generic Int
            val channel = Channel<Int>(capacity = 10, onBufferOverflow = BufferOverflow.DROP_OLDEST)  // there DROP_OLDEST,
                                                                        // DROP_LATEST, SUSPEND
            val job1 = launch{
//                send data to channel
//                println("send data 1 to channel")
//                channel.send(1)
//                println("send data 2 to channel")
//                channel.send(2)
                repeat(100){
                    println("send data $it to channel")
                    channel.send(it)
                }
            }
            job1.join()

//            make coroutines 2
            val job2 = launch{
                // receive data from channel
//                println("receive data ${channel.receive()} from channel")
//                println("receive data ${channel.receive()} from channel")
                repeat(10){
                    println("receive data ${channel.receive()} from channel")
                }
            }
            job2.join()

            joinAll(job1, job2) // wait for all coroutines to finish
            channel.close() // close channel    `
        }
    }


//    make test channel undelivered
    @Test
    fun testChannelUndelivered() {
//         make undelivered channel
        val channel = Channel<Int>(capacity = 10) {
            println("Undelivered channel $it") // this will be called when channel is full
        }
        channel.close()// close channel

//    will be undelivered channel bcs launch coroutines after channel is closed
        runBlocking {
            val job = launch{ // launch coroutines after channel is closed
                channel.send(10)
                channel.send(100)
            }
            job.join()
        }
    }

//    make test channel auto integrated with coroutines
    @Test
    fun testChannelProduce() {
        val scope = CoroutineScope(Dispatchers.IO)
//        val channel = Channel<Int>()
//
//        val job1 = scope.launch {
//            repeat(100) {
//                channel.send(it)
//            }
//        }
 //  make recive channel with produce
        val channel: ReceiveChannel<Int> = scope.produce {
            repeat(100) {
                send(it)
            }
        }
// channel without produce
        val job2 = scope.launch {
            repeat(100) {
                println(channel.receive())
            }
        }
// run all coroutines
        runBlocking {
            joinAll(job2)
        }
    }
}
