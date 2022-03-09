package app

fun main() {
//    make mutable list
    val list : MutableList<String> = mutableListOf()

//    add elements to list
    list.add("Hello")
    list.add("World")
    list.add("Python")
//    println(list)

//    Change elements in list
    list[2] = "Kotlin"
//    println(list)

//    remove elements from list
    list.removeAt(1)
//    println(list)

//    loop list
    for (item in list) {
        println(item)
    }
}



