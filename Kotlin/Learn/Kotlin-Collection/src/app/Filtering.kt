package app

fun main() {
//    make list
    val list1 = listOf("Android", "Kotlin", "JavaScript","Python")
//    filltering a length word <= 5
    val list2 = list1.filter { it.length <= 6 }
    println(list2)
//    filltering a index if index % 2 == 0
    val list3 = list1.filterIndexed { index, value -> index % 2 == 0 }
    println(list3)

    val list4: List<Any?> = listOf(null, 24, "Andrian", "Reihannudin", 3, null)
//    filltering by type data
    val listString = list4.filterIsInstance<String>()
    println(listString)
    val listInt = list4.filterIsInstance<Int>()
    println(listInt)
    val listNotNull = list4.filterNotNull()
    println(listNotNull)

//    filltering price
    val price : List<Int> = listOf(10000, 20000, 30000, 40000, 50000)
    //    filltering price < 30000
    val list5 = price.filter { it < 40000 }
    println(list5)



}