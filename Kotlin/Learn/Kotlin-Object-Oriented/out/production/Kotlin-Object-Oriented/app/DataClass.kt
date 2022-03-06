package app

import data.Product

fun main() {
//    Call data Class
    val product = Product("Iphone", 1222,"Tech" )
    println(product)

//    Copy dataclass
    val product2 = product.copy(price = 999)
    println(product2)

}