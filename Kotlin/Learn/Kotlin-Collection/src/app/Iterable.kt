package app

//make functions displayIterable
fun <T> displayIterable(iterable: Iterable<T>){
//    for (item in iterable){
//        println(item)
//    }

//    For loop Code
    val iterator = iterable.iterator()
    while (iterator.hasNext()){
        val value = iterator.next()
        println(value)
    }
}

fun main() {
//    Access list
    displayIterable(listOf("Andrian","Raihannudin"))
//    Access set
    displayIterable(setOf("Andrian","Raihannudin"))
//    Access map
    displayIterable(mapOf("Andrian" to "Raihannudin").entries)
}