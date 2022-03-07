package app
//Make interface with function
interface CanSayHello{
    fun sayHello(name: String)
}

//make class can be inherit
open class Employee
//extend class Employee
class Manager: Employee()
//extend class Employee and interface CanSayHello
class VicePresident: Employee(), CanSayHello{
    override fun sayHello(name: String) {
        println("Hello $name, i am Vice President")
    }
}
//extend class Employee just can call class and inherited classes Employee
//Condition Constaraint 1 parrent
//class Company<T : Employee>(val employee: T)
//Condition Constaraint 2 parrent
class Company<T>(val employee: T) where T: Employee, T: CanSayHello

fun main() {
//    val data1 = Company(Employee()) //Error bcs dont have function sayHello
//    val data2 = Company(Manager()) //Error bcs dont have function sayHello
    val data3 = Company(VicePresident())
    data3.employee.sayHello("Reihan")
//    val data4 = Company("Reihan") // error bcs just can call class and inherited classes Employee
}
