package dataNew

class Application(val name: String) {

//    make inner singleton object
//    object Utilities{

    //    with companion object
    companion object{
        fun toUpper(name:String): String{
            return name.uppercase()
        }
    }
}