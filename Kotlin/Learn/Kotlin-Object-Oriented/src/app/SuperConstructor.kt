package app

import data.ExcetutiveCustomer
import data.PremiumCustomer

fun main(){
    val premiumCustomer = PremiumCustomer("John")
    println(premiumCustomer.name)

//    Acces Super Constructor
    val excetutiveCustomer = ExcetutiveCustomer("Han",1000000)
    println(excetutiveCustomer.name)
    println(excetutiveCustomer.balance)
}