package app

fun main(){
    //    make list
    val list1 = listOf("Android", "Kotlin", "JavaScript","Python")

//    make filtering partition
//    val pair: Pair<List<String> , List<String>> = list1.partition { it.length <= 6}
//    with destructuring
    val (listMatch, listNotMatch) = list1.partition { it.length <= 6}

    println("listMatch: $listMatch")
    println("listNotMatch: $listNotMatch")

}