package app
//make class with data Generic
class Container<T>(var data: T)

//make function with type projection Covarian to make the output, and Contract to make the input
fun copyContariner(from: Container<out Any>, to: Container<in Any>) {
    to.data = from.data
}

fun main() {
//    def container1
    val container1 = Container("Reihan")
//    can subtitute the type of the data with the type projection
    val container2: Container<Any> = Container("Ijat")
// this is will copy container 1 to container 2
    copyContariner(container1, container2)
//    running
    println(container1.data)
    println(container2.data)
}