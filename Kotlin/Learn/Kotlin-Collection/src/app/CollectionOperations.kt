package app

fun main() {
//    can do it in List , mutableList, set, mutableSet
    listOf("Andrian", "Raihannudin").forEach { value -> println(value) }
    listOf("Andrian", "Raihannudin").forEachIndexed { index, value ->
        println("$index $value") }
}

