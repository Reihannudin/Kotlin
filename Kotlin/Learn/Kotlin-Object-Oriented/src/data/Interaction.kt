package data

//make interface
//interface don't need to open to inheritance'
interface Interaction {
//    make interface properties
    val name: String
//    make interface methods
    fun sayHello(name: String) {// also you can declarate your function in here, with concrate function
        println("Hello $name, my name is ${this.name}") // concrate function
    }
}

//make interface
interface Go: Interaction{ // you can intheretence this interface
//    make interface methods
    fun go(){
        println("I'm going")
    }
}

interface  MoveA{
    fun move(){
        println("I'm moving A")
    }
}

interface  MoveB {
    fun move() {
        println("I'm moving B")
    }
}

//override class from interface
class Human(override val name:String):  Go, MoveA, MoveB { // if interface you can add more tha 1 parent ,
                                                         // elif class you only can add 1 parent
//    what if there 2 interface and 2 function and function same name, what are we will doing?
    override fun move() {
      super<MoveA>.move() // super<MoveA> is moveA function
      super<MoveB>.move() // super<MoveB> is moveB function
      println("I'm moving")
    }

//    override function from interface
//    override fun sayHello(name: String) {
//        println("Hello $name, my name is ${this.name}")
//    }
}