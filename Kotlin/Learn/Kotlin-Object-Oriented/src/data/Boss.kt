package data

//Mote : Inner class and Outer class not connected one another
//if you want connected inner class and outer class u can use inner in the front of class name

//Make Outter Class
class Boss(val name: String) {
// make inner class
    inner class Employee(val name:String){
//        make function in inner class
        fun hi(){
            println("Hi, my name is $name, my boss name is ${this@Boss.name}")
        }
    }
}
