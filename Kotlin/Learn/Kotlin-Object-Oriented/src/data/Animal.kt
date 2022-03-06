package data

//make abstract class
abstract class Animal {
//    make abstract property
    abstract  val name: String
//    make abstract function
    abstract fun run()
}

class Cat: Animal() {
//    override property abstract
    override val name: String = "cat"
//    override function abstract
    override fun run() {
        println("cat is running")
    }
}

class Dog: Animal(){
//    override property abstract
    override val name: String = "dog"
//    override function abstract
    override fun run() {
        println("dog is running")
    }
}