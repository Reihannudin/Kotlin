package app
//Make Generic class with contravariant type parameter
//contravariant can running in input but cannot be running in output
class Contravariant<in T>{
//    make Generic function
    fun sayHello(param: T){
        println("Hello $param")
    }

//    Cannot run in output
//    fun getData():T{
//        return data
//    }
}

fun main() {
//    access contravariant class
    val contravariantAny = Contravariant<Any>()
//    subtitle type data
    val contravariantString = Contravariant<String>()
//    print the function
    contravariantString.sayHello("Reihan")

//    Error
//    contravariantAny.getData// Error
}