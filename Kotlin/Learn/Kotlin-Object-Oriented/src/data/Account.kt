package data

import kotlin.properties.Delegates

//makking class with lazy properties
class Account (bio: String = ""){
//    lazy properties
    val name: String by lazy {
        println("Name is called")
        "Reihan"
    }
//    eager properties
    val age: Int = 16

//    define Observable Properties
    var bio: String by Delegates.observable(bio){
        property, oldValue, newValue ->
        println("${property.name} changed from $oldValue to $newValue")
    }
}
