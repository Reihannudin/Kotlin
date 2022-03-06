package app

import exception.ValidationException

//make functions sayhello with exception
fun validateAndSayHello(name: String){
//    make throw exception
    if(name.isEmpty()) {
        throw ValidationException("Name is Blank")
    }else {
        println("Hello $name")
    }
}

fun main() {
//    make try and catch
    try{
        validateAndSayHello("Reihan")
        validateAndSayHello("")
//        if validateAndSayHello isBlank will throw ValidationException
    }catch (error: ValidationException){ // if want catch all error shoud change with Throwable
        println("Terjadi error ${error.message}")
    }catch (error: Throwable){
        println("Terjadi error ${error.message}")
    }finally { // a command that will always be executed whether error or not
        println("Program Selesai")
    }
}