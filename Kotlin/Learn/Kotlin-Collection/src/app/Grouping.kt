package app

fun main() {
    val list = listOf("a","a","b","c","c","c","b","a","a","ab","bc","ab","bc")
//    make groupBy from their data with map
    val map1: Map<String, List<String>> = list.groupBy { value -> value } // you can use it
    println(map1)
//    make groupBy from their length data with map
    val map2: Map<Int, List<String>> = list.groupBy { values -> values.length } // you can use it
    println(map2)

//    making groupBy with Grouping
    val grouping : Grouping<String, String> = list.groupingBy { value -> value }
    println(grouping)
}