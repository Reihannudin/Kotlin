package app

fun main() {
//    make pair Manually
    val pair1 : Pair<String, String> = Pair("Andrian","Raihannudin")
//    access pair
    println(pair1.first)
    println(pair1.second)
//    make pair with to function with Generic Type
    val pair2 : Pair<String, String> = "Andrian" to "Raihannudin"
//    access pair
    println(pair2.first)
    println(pair2.second)
//    make pair with to function
    val pair3 = "Andrian" to "Raihannudin"
//    access pair
    println(pair3.first)
    println(pair3.second)

}