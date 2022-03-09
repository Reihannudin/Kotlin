package app

fun main() {
    val range = (1..20).toList()

//    get first element in range it > 10
    println(range.first { it > 10})
//    get last element in range it > 10
    println(range.last { it > 10})
//    get firstOrNull element in range it > 50
    println(range.firstOrNull { it > 50})
//    get lastOrNull element in range it > 50
    println(range.lastOrNull { it > 50})
//    get find element in range it > 50
    println(range.find { it > 11})
//    get findLast element in range it > 50
    println(range.findLast { it > 50})


}