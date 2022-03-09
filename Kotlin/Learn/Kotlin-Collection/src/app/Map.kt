package app

fun main(){
//    make map
    val map : Map<String, String> = mapOf(
        "key1" to "val1",
        "key2" to "val2",
        "key3" to "val3"
    )

//    access only keys
    println(map.keys)
//    access only values
    println(map.values)
//    access entries
    println(map.entries)
//    access map with loops
    for ((key, value) in map){
        println("$key -> $value")
    }

}