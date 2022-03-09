package app

class Application(map: Map<String, Any>){
    val name: String by map
    val version: String by map
}

fun main(){
    val application= Application(mapOf(
        "name" to "Kotlin",
        "version" to "1.1.0"
    ))


    println(application.name)
    println(application.version)

    println("Application: ${application.name} Version: ${application.version}")
}