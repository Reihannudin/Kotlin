package app

fun main() {
//    make variable numbers with range data and convert to list
    val numbers = (0..100).toList()
//make list1 numbers slice and only show 10 - 20
    val list1 = numbers.slice(10..20)
    println(list1)
//make list2 numbers slice and only show 0 - 100 with step 10
    val list2 = numbers.slice(0..100 step 10)
    println(list2)
//make list2 numbers slice and only show from 100 to 0 with step 10
    val list3 = numbers.slice(100 downTo 0 step 10)
    println(list3)
}