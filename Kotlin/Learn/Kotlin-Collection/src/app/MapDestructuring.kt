package app


fun main() {
    val map = mapOf(
        "a" to "Andrian",
        "b" to "Raihan",
        "c" to "Nudin"
    )
//    destructuringMap(map)
    for ((key, value) in map) {
        println("$key : $value")
    }
//    alternativeWay(Map forEach)
    map.forEach {entry -> println("${entry.key} : ${entry.value}")}
//    the best way doing destructuring
    map.forEach {key, value -> println("$key : $value") }

}