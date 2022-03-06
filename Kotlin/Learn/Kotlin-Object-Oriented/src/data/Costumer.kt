package data

//Make class and Primary Constructor
open class Customer(val name:String, val type:String, val balance:Long){
//    make Secondary constructor 1
    constructor(name:String, type:String):this(name,type,0)
//        make Secondary constructor 2
    constructor(name:String):this(name,"Standart")
}

//with Super
class PremiumCustomer : Customer{
//    make super constructor
    constructor(name:String) :super (name,"Premium")
//    make super constructor
    constructor(name:String, balance:Long) :super (name,"premium", balance)
}

//without Super
// if we make constractor indise class we can't use Super keyword
class ExcetutiveCustomer(name: String,balance: Long) : Customer(name, "Executive", balance){
    constructor(name: String) :this(name,0)
}
