// Label
// Label adalah penanda 
// Untuk membuat label di Kotlin, cukup menggunakan nama label lalu diikuti dengan karakter @ 

// function Test
fun test(name: String, param: (String) -> Unit): Unit = param(name) 

fun main(){
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            println("$i x $j = ${i*j}")

            //Label Break, Continue dan Return
            // Label Break
            if (j == 10){
                break@loopI
            }
        
            // Label Continue
            if (j == 5){
                continue@loopI
            }

            // Label Return
            test("Reihan") testLabel@{
                if (it == "Reihan"){
                    return@testLabel
                }
            }
            println("Reihan")
        }
    }
}

