package app

import data.Laptop
import data.SmartPhone

//IS:
//make any function
//With If
fun printObjectIF(any: Any){
//    Cast the any object to the Laptop class
//    Checking Conversion Type Data
//    Make all class as to be any
    if (any is Laptop){
        println("Laptop with name ${any.name}")
    }else if (any is SmartPhone) {
        println("SmartPhone with name ${any.name} and OS ${any.os}")
    }else {
        println(any)
    }
}
//make any function
//With If
fun printObjectWhen(any: Any){
//    Cast the any object to the Laptop class
//    Checking Conversion Type Data
//    Make all class as to be any
    when(any){
        is Laptop -> println("Laptop with name ${any.name}")
        is SmartPhone -> println("SmartPhone with name ${any.name} and OS ${any.os}")
        else -> println(any)
    }
}

//AS:
//Converter Type Data
fun printString(any: Any){
    val value = any as String // if conversion is failed, print error message
    println(value)
}

fun printStringSafe(any: Any){
    val value = any as? String // if conversion is failed is will be null
    println(value)
}

fun main(){

//    Print Function As
    printString("Hello")
    printStringSafe(1)

//    Print Function IS
    printObjectWhen("Reihan")
    printObjectIF(1)
    printObjectWhen(Laptop("Macbook"))
    printObjectIF(SmartPhone("Samsung","Android"))

}