package app

import data.Gender

fun main(){
//    call data Male from enum class Gender
    val man = Gender.MALE
//    call data Female from enum class Gender
    val woman = Gender.FEMALE
//    call all data from enum class Gender
    val allGender: Array<Gender> = Gender.values()

//    conversion value from string
    val manFromString = Gender.valueOf("MALE")
    val womanFromString = Gender.valueOf("FEMALE")

    println(man)
    println(woman)
    println(allGender.toList())

    man.showDescription()
    woman.showDescription()
}