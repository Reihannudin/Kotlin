package app


//make functions displayIterable
fun <T> displayMutableIterable(iterable: Iterable<T>){
//    for (item in iterable){
//        println(item)
//    }

//    For loop Code
    val iterator = iterable.iterator()
    while (iterator.hasNext()){
        val value = iterator.next()
//        iterator.remove() // will remove data in iterator
        println(value)
    }
}

fun main() {
//    Access list
    displayMutableIterable(mutableListOf("Andrian","Raihannudin"))
//    Access set
    displayMutableIterable(mutableSetOf("Andrian","Raihannudin"))
//    Access map
    displayMutableIterable(mutableMapOf("Andrian" to "Raihannudin").entries)
}