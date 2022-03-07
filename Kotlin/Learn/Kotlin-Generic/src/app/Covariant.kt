package app
//convariant only can running as output
class Convariant <out T>(val data: T){
//    convariant data only can return data
    fun data(): T{
        return data
    }
// do not make functions with input Convariant
//    fun getData(param: T){
//        data = param
//    }
}

fun main() {
    //convariant can convert the type of the parameter
    val convariantString = Convariant<String>("Reihan")
    val convariantAny : Convariant<Any> = convariantString

    println(convariantAny.data())
//    convariantAny.getData(100)
}

