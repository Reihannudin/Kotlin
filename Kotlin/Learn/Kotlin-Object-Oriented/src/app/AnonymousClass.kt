package app

import data.Action

//Call Interface in class Without Annonymous function
//call action interface to be function
fun fireAction(action: Action){
    action.action()
}
class SampleAction: Action{
    override fun action() {
        println("Sample Action")
    }
}

fun main(){
//    Call without annonymous function
    fireAction(SampleAction())

//    Call with annonymous function one
    fireAction(object : Action{ // this is annonymous class
        override fun action() {
            println("Action one")
        }
    })

//    call with annonymous function two
    fireAction(object : Action{ // this is annonymous class
        override fun action() {
            println("Action two")
        }
    })
}

