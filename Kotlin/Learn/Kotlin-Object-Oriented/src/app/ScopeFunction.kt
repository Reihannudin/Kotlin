package app

import data.Members
import data.Student

fun main() {
    val members = Members("Reihan",16)
//    Basic
//    println(members.name)
//    println(members.age)

//    Let functions
    members.let{
        println(it.name)
        println(it.age)
    }
//    also you can print like this too
    var resultsLet = members.let{
        "Name: ${it.name}, Age: ${it.age}"
    }
    println(resultsLet)

//    Run functions
    members.run{
        println(this.name)
        println(this.age)
    }
    //    also you can print like this too
    var resultsRun= members.run{
        "Name: ${this.name}, Age: ${this.age}"
    }
    println(resultsRun)

//    Apply Function
    members.apply{
        println(this.name)
        println(this.age)
    }
    //    also you can print like this too
    var resultsApply: Members = members.apply{
        "Name: ${this.name}, Age: ${this.age}"
    }
    println(resultsApply)

//    Also functions
    members.also{
        println(it.name)
        println(it.age)
    }
    //    also you can print like this too
    var resultsAlso: Members = members.also{
        "Name: ${it.name}, Age: ${it.age}"
    }
    println(resultsAlso)

//    With functions
    with(members){
        println(this.name)
        println(this.age)
    }
    //    also you can print like this too
    var resultsWith = with(members){
        "Name: ${this.name}, Age: ${this.age}"
    }
    println(resultsWith)
}