package app


import data.ProductManager
import data.VicePresident

fun main(){
//    Mengakses Behavior parent
    val manager = ProductManager("Ziyaad")
    manager.sayHello("Joko")

//    Mengakses Behavbior child
    val VP = VicePresident("Reihan")
    VP.sayHello("Joko")
}