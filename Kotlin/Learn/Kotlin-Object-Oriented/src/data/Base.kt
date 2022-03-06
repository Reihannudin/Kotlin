package data

//make interface and function
interface Base {
    fun sayHello(name:String)
    fun sayGoodBye(name:String)
}

//inherit from interface
class MyBase: Base{
    override fun sayHello(name: String) {
        println("Hello $name")
    }
    override fun sayGoodBye(name: String) {
        println("Goodbye $name")
    }
}

//make manual delegation
class MyBaseDelegate(val base: Base): Base{
    override fun sayHello(name: String) {
        base.sayHello(name)
    }
    override fun sayGoodBye(name: String) {
        base.sayGoodBye(name)
    }
}

////make automatic delegation
class MyBaseDelegateAuto(val base: Base): Base by base{
//    you can change function content in automatic delegation like this
    override fun sayHello(name: String) {
        println("Hii $name")
    }
}