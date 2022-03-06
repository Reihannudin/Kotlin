package data

//Destructuring Declaration with data class
data class Game(val name: String , val price: Int, val rating: Double){
    //Destructuring Declaration without data class
//    operator fun component1(): String = name
//    operator fun component2(): Int = price
//    operator fun component3(): Double = rating
}