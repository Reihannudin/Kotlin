package app

fun main() {
//    make map
    val map = mapOf(
        "key1" to "value1",
        "key2" to "value24",
        "key3" to "value3"
    )
//    Get Value mapOf
    println(map.getValue("key1"))
//    Get Value mapOf else
    println(map.getOrElse("key4") { "Ups" })
//    Get value enteries with filter
    println(map.filter { (key, value) -> value.length > 6 })
//    Get Keys with filter
    println(map.filterKeys { key -> key > "key2" })
    println(map.filterKeys { it != "key2" })
//    Get Values with filter
    println(map.filterValues { value -> value.length > 3 })
    println(map.filterValues { it.length > 6 })
}