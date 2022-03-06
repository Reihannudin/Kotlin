package app

import data.Aplication
import data.Utilities

fun main() {
//    akses singleton object
    println(Utilities.name)
//    ubah isi singleton object
    Utilities.name = "dirubah"
//    akses singleton object dengaan function
    println(Utilities.toUpper("reihan"))
//    call function yang diubah
    a()
    b()

//    akses singleton object inner
//    println(Aplication.Utilities.toUpper("ziyaad"))
//    akses singleton object companion
    println(Aplication.toUpper("ziyaad"))
}

//make a test function
fun a(){
    println(Utilities.name)
}
fun b(){
    println(Utilities.name)
}