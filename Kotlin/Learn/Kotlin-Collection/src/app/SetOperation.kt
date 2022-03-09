package app

fun main() {
    val numbers1 = (1..10).toList()
    val numbers2 = (6..15).toList()

//    print all indexed numbers
    println(numbers1 union numbers2)
//    print there indexed from 2 numbers
    println(numbers1 intersect numbers2)
//    print there indexed from 1 numbers
    println(numbers1 subtract numbers2)
    println(numbers2 subtract numbers1)


}