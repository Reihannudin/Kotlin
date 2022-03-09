package app

fun main() {
//    Make mutable map
    val mutableMap: MutableMap<String, String> = mutableMapOf()
//    add elements to mutable map
    mutableMap.put("key1", "value1") // put
    mutableMap["key2"] = "value2" // manually
    mutableMap.putAll(mapOf("key3" to "value3", "key4" to "value4"))

//    print mutable map key1
    println(mutableMap["key1"])
//    print mutable map key2
    println(mutableMap.get("key2"))
//    print mutable map key3
    println(mutableMap.get("key3"))
//    print mutable map key4
    println(mutableMap.get("key4"))
//    print mutable map key5 with getOrDefault
    println(mutableMap.getOrDefault("key5", "default"))

//    Remoove mutable map key1
    mutableMap.remove("key2")

    //    access map with loops
    for ((key, value) in mutableMap){
        println("$key -> $value")
    }


}