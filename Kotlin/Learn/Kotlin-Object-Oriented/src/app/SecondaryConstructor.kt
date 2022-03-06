package app

import data.Address
import data.Car

fun main(){
//    Secondary Constructor Car()
    val car1 = Car("Supra MK-5", "Toyota", "Merah")
    var car2 = Car("GTR-35", "Nissan")

    println(car1.model)
    println(car2.model)
    println(car1.brand)
    println(car2.brand)
    println(car1.color)
    println(car2.color)

//    Secondary Constructor Address
    val address1 = Address("Jl. Sudirman", "Jakarta")
    val address2 = Address("Jl. Raya", "Bogor", "Indonesia")
    println(address1.street)
    println(address2.street)


}