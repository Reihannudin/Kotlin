package data

//Make Parrent class
//make intheritance class with open in front
open class Employee(val name: String){
//    Make function overiding with open fun in front
    open fun sayHello(name:String){
        println("Hello $name, my name is ${this.name}")
    }
}

//make child class and make overiding Class berserta properti dan fungsi nya
//add open to make inheritance and function overiding
open class ProductManager(name: String): Employee(name){
//    This function will not be overriding bcs this add final in front
//    final override fun sayHello(name: String) {
    override fun sayHello(name: String) {
        println("Hello $name, my name is ProductManager ${this.name}")
    }
}

//make child class from child class
class Developer(name: String): ProductManager(name){
//    override function from child class
    override fun sayHello(name: String) {
        println("Hello $name, my name is Developer ${this.name}")
    }
}


//make child class
class VicePresident(name: String): Employee(name){
//    declare function overiding
    override fun sayHello(name: String) {
        println("Hello $name, my name is VicePresident ${this.name}")
    }
}