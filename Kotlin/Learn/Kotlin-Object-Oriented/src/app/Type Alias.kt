package app

import data.Aplication

//make type alias
typealias APP = Aplication
typealias Application = Aplication

//type alisa from different directory
typealias AppNew = dataNew.Application

//typealias for function
typealias StringLambda = ()->String

//make fun say hello
fun sayHello(supplier: StringLambda){
    println("Hello ${supplier()}")
}


fun main() {
    val app = APP("Kotlin App")
    val application = Application("Kotlin Application")
    val appNew = AppNew("Kotlin App New")

    var sayhello = sayHello {
        "Reihan"
    }

    println(sayhello)
    println(app.name)
    println(application.name)
    println(appNew.name)
}

