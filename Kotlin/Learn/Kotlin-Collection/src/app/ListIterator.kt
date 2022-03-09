package app

fun <T> displayListIterator(listIterator: ListIterator<T>){
    println("Display next")
    while(listIterator.hasNext()){
        println("Displaying next iterator: ${listIterator.next()}")
    }

    println("Display previous")
    while(listIterator.hasPrevious()){
        println("Displaying previous iterator: ${listIterator.previous()}")
    }
}

fun main() {
    displayListIterator(listOf("Andrian", "Raihannudin").listIterator())
}