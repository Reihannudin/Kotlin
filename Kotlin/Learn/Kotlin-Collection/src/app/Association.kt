package app

fun main() {
//    also you can do this in set and list to transform to map
//    make a list of strings
    val list: List<String> = listOf("Andrian","Raihan","Nudin")

//    make Association to map
    val map: Map<String, Int> = list.associate { Pair(it, it.length) }
    println(map)

//    make Association to map but generate the values
    val map2: Map<String, Int> = list.associateWith { it.length }
    println(map2)

//    make Association to map but generate the Keys
    val map3: Map<Int, String> = list.associateBy { it.length }
    println(map3)

}