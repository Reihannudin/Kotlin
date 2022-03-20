package programmerzamannow.learnspingbootdesignpattern.prototype

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Scope
import java.util.*
import java.util.EnumSet.range

//Add SpringBootApplication
@SpringBootApplication
class PrototypeApplication {

    @Bean //Add Bean
    @Scope("prototype") //Add Scope(prototype)
    fun employeeStaff(): Employee? {
        val employee = Employee()
        employee.setId(UUID.randomUUID().toString())
        employee.setPosition(Position.STAFF)
        employee.setSalary(10000000L)
        return employee
    }

    @Bean //Add Bean
    @Scope("prototype") //Add Scope(prototype)
    fun employeeManager(): Employee? {
        val employee = Employee()
        employee.setId(UUID.randomUUID().toString())
        employee.setPosition(Position.MANAGER)
        employee.setSalary(20000000L)
        return employee
    }


    @Bean
    @Scope("prototype") //Add Scope(prototype)
    fun employeeVicePresident(): Employee? {
        val employee = Employee()
        employee.setId(UUID.randomUUID().toString())
        employee.setPosition(Position.VICE_PRESIDENT)
        employee.setSalary(3000000L)
        return employee
    }

    @Bean
    @Scope("prototype") //Add Scope(prototype)
    fun employeeCLevel(): Employee? {
        val employee = Employee()
        employee.setId(UUID.randomUUID().toString())
        employee.setPosition(Position.C_LEVEL)
        employee.setSalary(40000000L)
        return employee
    }
}