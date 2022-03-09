package app

fun main() {
    val set = setOf("Andrian","Reihan","Nudin")

//    get element at position
    println(set.elementAt(1))
//    get first element in set
    println(set.first())
//    get last element in set
    println(set.last())
//    get elementAtOrNull position
    println(set.elementAtOrNull(1))
    println(set.elementAtOrNull(3))
//    get elementAtOrElse position
    println(set.elementAtOrElse(1) { "Not Found" })
    println(set.elementAtOrElse(3) { "Not Found" })

}