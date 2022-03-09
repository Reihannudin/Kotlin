package app

fun main() {
//    make list
    val list: List<Pair<String, String>> = listOf(
        "BTS" to "Army",
        "One Direction" to "Directioners",
        "BlackPink" to "Blink"
    )
// unzip the list
    val pair: Pair<List<String>, List<String>> = list.unzip()
    println(pair.first)
    println(pair.second)
//   unzip the list with destructure
    val (first, second ) = list.unzip()
    println(first)
    println(second)
}