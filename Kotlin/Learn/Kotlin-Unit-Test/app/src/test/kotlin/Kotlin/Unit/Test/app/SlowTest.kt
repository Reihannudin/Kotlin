package Kotlin.Unit.Test.app

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Timeout
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode
import java.util.concurrent.TimeUnit

//parallel execution test
@Execution(ExecutionMode.CONCURRENT)

class SlowTest {
    @Test
//    you can make time out if test > 5 seconds
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    fun SlowTest1(){
        Thread.sleep(3_000) // this code will be executed after 10 seconds
    }
    @Test
    //    you can make time out if test > 5 seconds
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    fun SlowTest2(){
        Thread.sleep(3_000) // this code will be executed after 10 seconds
    }
    @Test
    //    you can make time out if test > 5 seconds
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    fun SlowTest3(){
        Thread.sleep(3_000) // this code will be executed after 10 seconds
    }
}