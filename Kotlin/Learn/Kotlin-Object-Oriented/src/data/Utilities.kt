package data
//Make Singleton object
object Utilities {
//    make properties in singleton object
var name:String = "My Utilities"
//make functions in singleton object
    fun toUpper(value:String):String{
        return value.uppercase()
    }
}