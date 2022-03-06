package app

import data.Television

fun main() {
//    def class Television
    val tv = Television()
//    call initTelevision if don't call this method, will be error
    tv.initTelevision("Samsung")
//    also you can do this:
//    tv.brand = "Samsung"
//    print brand
    println(tv.brand)
}