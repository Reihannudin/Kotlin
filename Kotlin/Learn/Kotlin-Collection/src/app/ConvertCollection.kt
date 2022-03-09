package app

fun main() {
//    make array
    val array = arrayOf(9,2,4,5, 3, 1,7, 8,6)
//    make ranges
    val range = 1..100
//    convert range to list
    val list = range.toList()
//    convert array to mutable list
    val mutableList = array.toMutableList()
//    convert list to set
    val set = list.toSet()
//    convert list to mutable set
    val mutableSet = list.toMutableSet()
//    convert array to toSortedSet
    val sortedSet = array.toSortedSet()

//    println
    println(mutableList)
    println(set)
    println(mutableSet)
    println(sortedSet)
}