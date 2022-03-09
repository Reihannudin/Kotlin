package app

fun main() {
    val list1 = listOf("Android", "Kotlin","Java")
//    make plus operator collection
    val list2 = list1 + "Python"
    println(list2)
//    make plus List operator collection
    val list3 = list1 + listOf("Github","Figma","VScode")
    println(list3)
//    make minus operator collection
    val list4 = list1 - "Java"
    println(list4)
//    make minus List operator collection
    val list5 = list1 - listOf("Android","Figma")
    println(list5)

//    PLUS MINUS IN MAP
    val map1 = mapOf("key1" to "value1","key2" to "value2")
//    make plus operator collection Map
    val map2 = map1 + ("key3" to "value3")
    println(map2)
//    make minus operator collection Map
    val map3 = map1 - "key1"
    println(map3)

}