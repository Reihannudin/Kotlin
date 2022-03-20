package programmerzamannow.learnspingbootdesignpattern.prototype

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext

@SpringBootTest(classes = [PrototypeApplication::class])
class PrototypeApplicationTest {

    //     injection applicationContext
    @Autowired
    private lateinit var applicationContext: ApplicationContext

    @Test
    fun testPrototype(){
        val ziyaad : Employee = applicationContext.getBean("employeeStaff", Employee::class.java)
        ziyaad.setName("Ziyaad")
        println(ziyaad)

        val eko : Employee = applicationContext.getBean("employeeManager", Employee::class.java)
        eko.setName("Eko")
        println(eko)

        val raffi : Employee = applicationContext.getBean("employeeVicePresident", Employee::class.java)
        raffi.setName("Raffi")
        println(raffi)

        val reihan : Employee = applicationContext.getBean("employeeCLevel", Employee::class.java)
        reihan.setName("Reihan")
        println(reihan)


    }
















}