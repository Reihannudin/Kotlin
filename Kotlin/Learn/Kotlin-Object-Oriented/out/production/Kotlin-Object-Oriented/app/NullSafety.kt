package app

data class Friend(val name:String)

//Null Checking with Safe Calls
fun sayHello(friend:Friend?) {
    if (friend != null) {
        println("Hello, ${friend.name}")
    }
}

//Null Checking with Elvis Operator
fun sayGoodbye(friend:Friend?){
    val name = friend?.name ?: "bro"
    println("Goodbye, $name")
}

//Null Checking with operator !!
fun attend(friend:Friend?){
    val name = friend!!.name
    println("$name Present")
}

fun main() {
    sayHello(Friend("John"))
    sayHello(null)
    sayGoodbye(Friend("John"))
    sayGoodbye(null)
    attend(Friend("John"))
//    attend(null) error
}