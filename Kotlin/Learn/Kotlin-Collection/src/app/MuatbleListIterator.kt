package app
//make mutableListIterator
fun <T> displayMutableListIterator(mutableListIterator: MutableListIterator<T>) {
    while (mutableListIterator.hasNext()) {
        println(mutableListIterator.next())
    }
}

//Make function remove ODD Number
fun removeOddNumber(mutableListIterator: MutableListIterator<Int>) {
    while (mutableListIterator.hasNext()) {
        val value = mutableListIterator.next()
        if (value % 2 != 0)
            mutableListIterator.remove()
    }
}

fun main() {
//    define mutableList
    val mutableList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    access remove odd function
    removeOddNumber(mutableList.listIterator())
//    display mutableList
    displayMutableListIterator(mutableList.listIterator())
}


