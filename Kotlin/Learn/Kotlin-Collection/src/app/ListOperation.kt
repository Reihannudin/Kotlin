package app

fun main() {
    val list = listOf("Andrian","Raihannudin")
//  get index
    println(list.get(1))
//    Get inde if index nott found will be null
    println(list.getOrNull(3))
    //    Get inde if index nott found will be else
    println(list.getOrElse(10){index -> "index $index is not found"})
//    Get index from index 0 and 2 value
    println(list.subList(0,2))

//    binarrysearch
    val sortedList = list.sorted()
    println(sortedList)
    println(sortedList.binarySearch("Andrian"))
    println(sortedList.binarySearch("Raihannudin"))
//    println(sortedList.binarySearch("Han"))

    val numbers = listOf(1,1,2,2,3,3,4,4,4,5,5)
    println(numbers.indexOf(2))
    println(numbers.lastIndexOf(2))
    println(numbers.indexOfFirst { it > 2 })
    println(numbers.indexOfLast { it > 2 })
}








