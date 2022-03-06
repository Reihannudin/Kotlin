package app

import data.Rectangle

fun main(){
    val rectangle = Rectangle()
    val corner = rectangle.corner
    val paramCorner = rectangle.paramCorner

//access properties Super
    println("Corner: $corner")
    println("ParamCorner: $paramCorner")
//access function Super
    rectangle.name()
}