package app

import data.Car

fun main(){
//    Make Variable with Constructor in inside
    var car1 =  Car("Almaz", "Wuling","Silver Grey")

    var car2 =  Car("Inova", "Toyota","White",2021)

    var car3 = Car("Fortuner","Toyota","Black",2022)

//    Print the car Model
    println(car1.model)
    println(car2.model)
    println(car3.model)

//    Print the car Brand
    println(car1.brand)
    println(car2.brand)
    println(car3.brand)

//    Print the car Color
    println(car1.color)
    println(car2.color)
    println(car3.color)

//    Print the car Year
    println(car1.year)
    println(car2.year)
    println(car3.year)
}