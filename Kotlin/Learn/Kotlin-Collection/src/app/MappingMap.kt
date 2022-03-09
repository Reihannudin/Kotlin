package app

fun main() {
//    make map
    val map: Map<Int, String> = mapOf(
        1 to "value1",
        2 to "value2",
        3 to "value3"
    )

//    mapping keys
    val mapKeys = map.mapKeys { it.key * 10 }
    println(mapKeys)

//    mappings values
    val mapValues = map.mapValues { it.value.uppercase()}
    println(mapValues)

//    mapping values and keys
    val mapAll = mapKeys.mapValues {it.value.uppercase()}
    println(mapAll)
}