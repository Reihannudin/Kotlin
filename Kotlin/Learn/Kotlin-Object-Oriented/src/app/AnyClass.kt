package app

import data.SmartPhone

fun main(){
    val smartPhone = SmartPhone("IPhone","IOS")

    println(smartPhone.toString())
    println(smartPhone.hashCode())
}