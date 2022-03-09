package app


fun main() {
//    make imutable list
    val list : List<String> = listOf("apple","banana","orange")

//    Access imutable list
//    Get index of list
    println(list.get(1))
//    you can do it like this:
    println(list[1])
//    check where data in list
    println(list.indexOf("orange"))
//    Checking there is data in list
    println(list.contains("banana"))
//    Checking there is data in list more than 2
    println(list.containsAll(listOf("apple","banana")))
//    Checking list is empty
    println(list.isEmpty())
//    Checking list is not empty
    println(list.isNotEmpty())



}