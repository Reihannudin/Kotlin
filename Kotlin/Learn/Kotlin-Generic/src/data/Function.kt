package data
//amke class with constructor name
class Function(val name: String){

//    make function with Generic operator diamond
    fun <T> sayHello(param: T){
        println("Hello $param, my name is $name")
    }
//    make function with Generic operator diamond
    fun <C> count(param:C){
        println("Number $param")
    }

}