package app
//Testing Operation
fun main() {
    val list: List<String> = listOf("Android","Kotlin","Java")

//    make Checking any = if there one data is correct
    println(list.any { it.length > 5 })
    println(list.any())
//    make Checking all = if all data is correct
    println(list.all { it.length > 5 })
//    make Checking none = if there is no data is correct
    println(list.none { it.length > 5 })
    println(list.none())
//    make Checking count = how many data is correct
    println(list.count { it.length > 5 })



}