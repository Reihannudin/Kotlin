package program

import annotations.Fancy

//Menambahkan anotation
@Fancy(author = "Reihan")

class MyApplication(val name: String, val version: Int) {
    fun info():String = "Application $name $version"
}