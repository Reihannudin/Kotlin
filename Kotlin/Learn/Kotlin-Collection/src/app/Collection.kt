package app

//make displayCollection with Generic objects
fun <T> displayCollection(collection: Collection<T>) {
    for (item in collection) {
        println(item)
    }
}

//main function
fun main() {
    displayCollection(listOf("Andrian", "Raihannudin"))
    displayCollection(mutableListOf("Andrian", "Raihannudin")) // setOf muttable
    displayCollection(setOf("Andrian", "Raihannudin"))
    displayCollection(mutableSetOf("Andrian", "Raihannudin")) // listOf muttable
    displayCollection(mapOf("Andrian" to "Raihannudin").entries) // can bcs .entries will return setOf
//    displayCollection(mapOf("Andrian" to "Raihannudin")) // error bcs map is not collection
}