package programmerzamannow.learnspingbootdesignpattern.singleton

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext

// Add SpringBootTest to test the application
@SpringBootTest(classes = [SingletonApplication::class])
class SingletonApplicationTest {

//     injection applicationContext
    @Autowired
    private lateinit var applicationContext: ApplicationContext

//    make test
    @Test
    fun testSingleton(){
//    get bean
        val counter1 : Counter = applicationContext.getBean(Counter::class.java)
        val counter2 : Counter = applicationContext.getBean(Counter::class.java)
        val counter3 : Counter = applicationContext.getBean(Counter::class.java)

//     increment counter
        counter1.increment()
        counter2.increment()
        counter3.increment()

//    print counter
        println("Counter 1: ${counter1.getValue()}")
        println("Counter 2: ${counter2.getValue()}")
        println("Counter 3: ${counter3.getValue()}")
    }

//     make incrementCounterAsync
    fun incrementCounterAsync(counter: Counter, total : Int){
        Thread((Runnable {
            for (i in 0 until total){
                counter.increment()
            }
        })).start()
    }

//    make testAsync
    @Test
    fun IncrementRaceCondition(){
        var counter1 : Counter = applicationContext.getBean(Counter::class.java)
        var counter2: Counter = applicationContext.getBean(Counter::class.java)

        incrementCounterAsync(counter1, 100000)
    incrementCounterAsync(counter1, 100000)

        Thread.sleep(3_000)
        println(counter1.getValue())
        println(counter1.getValue())
    }

}