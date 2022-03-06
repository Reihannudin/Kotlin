package app

import data.City
import data.Country
import data.Location

fun main(){
//    val location = Location() Can't import location bcs this is abstract_class
//    only can print the child class
    val city = City("Jakarta")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)
}