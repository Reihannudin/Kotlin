package app
//make display mutable collection
fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (item in collection) {
        println(item)
    }
}

fun main() {
    // create mutable list
    displayMutableCollection(mutableListOf("Andrian", "Raihannudin"))
//    displayMutableCollection(listOf("Andrian", "Raihannudin")) // Error
    // create mutable set
    displayMutableCollection(mutableSetOf("Andrian", "Raihannudin"))
//    displayMutableCollection(setOf("Andrian", "Raihannudin")) // Error
    // create mutable map
    displayMutableCollection(mutableMapOf("Andrian" to "Raihannudin").entries)
//    displayMutableCollection(mapOf("Andrian" to "Raihannudin").entries) // Error
}