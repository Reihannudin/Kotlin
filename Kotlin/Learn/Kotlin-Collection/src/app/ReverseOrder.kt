package app

fun main() {
//    make mutble list
    var list1 = mutableListOf<String>("Andrian", "Reihannudin")
//    if reverse order he make a new block
    val listReverse = list1.reversed()
//    if ASReversed order he don't make a new block
    val listAsReversed = list1.asReversed()
//    add data to list
    list1.add("Reihan")
//    print list
    println(list1)
    println(listReverse)
    println(listAsReversed)
}