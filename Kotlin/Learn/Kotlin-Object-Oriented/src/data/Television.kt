package data

class Television {
//    make lateinit variable
    lateinit var brand: String

//    make function late init
    fun initTelevision(brand: String) {
        this.brand = brand
    }
}