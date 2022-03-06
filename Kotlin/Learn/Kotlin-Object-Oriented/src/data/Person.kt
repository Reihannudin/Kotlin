package data
//Make Class
class Person {
//    Declarate Properties
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

//    Membuat Function di dalam class
//    Membuat Function sayHello
    fun sayHello(name:String){
        println("Hello $name, my name is $firstName")
    }

//    ##########################################################
//    Jika ingin Membuat Sebuah fungsi yang sama
//    Lakukan ini:
      fun sayHello(firstName: String, lastName: String){
          println("Hello $firstName $lastName, my name is ${this.firstName}")
}
//    #####################
//    gunakan ThisKeyword untuk mengakses properti dari class
//    #####################

//    Jangan Lakukan Ini
//    Ini akan menjadi Function Overloading
    //fun sayHello(name:String){
    //    println("Hello $name, my name is $firstName")
    //}

//    Note:
//    yang harus dilakukan adalah membedakan parameternya
//    entah nama parameter nya ataupun tipe data dari parameternya
//    ##########################################################

//    Membuat function Run
    fun run(){
        println("Running")
    }
//    Membuat Function getFullName
    fun getFullName():String{
        return "$firstName $middleName $lastName"
    }
}
