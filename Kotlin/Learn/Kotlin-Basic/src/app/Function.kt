// Function
// Definisikan Fungsi
fun helloWorld(){
    println("Hello world")
    println("Good Morning")
}

// Function Parameter
// firstName, lastName adalah parameter
fun sayHello(firstName:String, lastName:String){
    println("Hello $firstName $lastName, Good Morning!!")
}

// Function Default Argument
// firstName, lastName adalah parameter 
// akan tetapi parameter lastName bisa kosong 
fun sayGoodBye(firstName:String , lastName:String = ""){
    println("Good Bye $firstName $lastName")
}

// Function Named Argument
// function yang memungkinkan membuat parameter agar tetap berurutan
// Meskipun saat di panggil acak
fun fullName(firstName:String,
             middleName:String,
             lastName:String){
    println("Hello $firstName $middleName $lastName")
             }

// Unit Returning Function
// membuat function yang memungkinkan untuk mengembalikan nilai
fun hellounit(name : String?): Unit {
    if (name == null){
        println("Hello, Who are you?")
    }else{
         println("Hello, $name")
    }
}

// Function Return Type
// Return digunakan untuk memberitahu bahwa function mengembalikan data, 
// kita harus menuliskan tipe data kembalian dari function tersebut
fun sum(a:Int, b:Int):Int{
    return a + b
}

// Single Expression Function
// Mempermudah untuk membuat fungction agar satu baris
// Single Expression Function <String>
fun hi(name: String): Unit = println("Hi $name")
// Single Expression Function <Int>
fun mul(a: Int): Int = a * 4

// Function Varargs Parameter
// Varargs artinya datanya bisa menerima lebih dari satu input, atau anggap saja semacam Array.
fun finalValue(name: String, vararg values: Int){
    var total = 0
    for (value in values){
        total += value
    }
    // return total;
    println("$name total value is $total")
}

// Extension Function
// Extension function adalah kemampuan menambahkan function pada tipe data yang sudah ada
fun String.hello(): String {
    return "Hello $this"
}

// Function Infix Notation
// Infix Notation adalah operasi yang biasa dilakukan di operasi matematika, dimana dia melakukan operasi terhadap dua data
// Syarat Function Infix Notation :
// Harus sebagai function member (akan dibahas di OOP) atau function extension
// Harus memiliki 1 parameter 
// Parameter tidak boleh varargs dan tidak boleh memiliki nilai default
infix fun String.to(type: String): String {
    if (type == "UP"){
        return this.uppercase()
    }else{
        return this.lowercase()
    }
}

// Return If & When
// function IF:
fun sayHalloIf(name: String = ""): String{
    return if (name == ""){
        "Hello buddy"
    }else{
        "Hello $name"
    }
}
// function WHEN:
fun sayHalloWhen(name: String = ""): String{
    return when(name){
        "" -> "Hello lad"
        else -> "Hello $name"
    }
}

// Recursive Function
// Recursive function adalah function yang memanggil function dirinya sendiri
// Non Recursive
fun factorialLoop(value: Int): Int {
    var result = 1;
    for (i in value downTo 1){
        result *= i
    }
    return result
}
// Recursive
fun factorialLoopRecursive(value: Int): Int {
    return when (value) {
        1 -> 1
        else -> value * factorialLoopRecursive(value - 1)
    }
}


// Tail Recursive Function
//Tail recursive function adalah teknik mengubah recursive function yang kita buat, menjadi looping biasa ketika dijalankan 
// Syarat Tail Recursive Function : 
// Tambahkan tailrec di functionnya
// Saat memanggil function dirinya sendiri, hanya boleh memanggil function dirinya sendiri, tanpa embel-embel operasi dengan data lain
// Basic Tail Recursive Function
tailrec fun display(value: Int){
    println(value)
    if (value > 0){
        display(value - 1)
    }
}
tailrec fun factorialTail(value: Int, total:Int=1): Int{
    return when (value){
        1 -> total
        else -> factorialTail(value - 1, total * value)
    }
}

// Lambda Expression
// Lambda expression secara sederhana adalah function yang tidak memiliki nama
// Biasanya saat kita membuat function, kita akan selalu membuat menggunakan kata kunci fun dan mendeklarasikan nama function nya
// Dengan lambda expression, kita bisa membuat function tanpa harus mendeskripsikan function nya
// Kode : Lambda Expression di Variable
val lambdaName : (String) -> String= {value: String ->
     value.uppercase()
    }
// Kode : It
val lambdaNameIt : (String) -> String = {
    it.uppercase()
}
// Kode : Method References
val lambdaNameRef : (String) -> String = String::uppercase

// Higher-Order Functions
// Higher-Order Function adalah function yang menggunakan function sebagai parameter atau mengembalikan function
fun hello_HOF(value: String, transformer: (String) -> String): String{
    return "Hello ${transformer(value)}";
}

// Anonymous Functions
// Anonymous Function sebenarnya mirip dengan lambda, hanya cara membuatnya saja yang sedikit beda, masih menggunakan kata kunci func
val anonymousFunctions = fun(value: String): String{
    if (value.isBlank()){
        return "Ups"
    }
    return value.uppercase()
}
// Kode : Anonymous Function as Parameter
val hello_anonymous = hello_HOF("Ziyaad", fun(value: String): String{
    if (value.isBlank()){
        return "Ups"
    }
    return value.uppercase()
})

// Closure
// Closure adalah kemampuan sebuah function, lambda atau anonymous function berinteraksi dengan data-data disekitarnya dalam scope yang sama
var counter: Int = 0
val lambdaIncrement: () -> Unit = {
    println("Lambda increment")
    counter++
 }

//  Inline Function
// Inline Function adalah function yang dapat dideklarasikan di dalam sebuah statement
// Saat menandai bahwa function adalah inline, maka secara otomatis semua parameter akan menjadi inline
inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}
// Noinline Function
// Jika kita ingin memberi tahu bahwa jangan melakukan inline terhadap parameter, kita bisa menandai parameter tersebut dengan kata kunci noinline
inline fun helloNoinline(firstName: () -> String,
                         noinline lastName: () -> String): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main(){

    // Memanggil Function
    helloWorld()

    // Memanggil Function Parameter
    sayHello("John", "Doe")

    // Memanggil Function Default Argument
    sayGoodBye("John")
    sayGoodBye("John", "Doe")

    // Memanggil Function Named Argument
    fullName(firstName = "John",
             lastName = "Doe",
             middleName = "William")

    // Memanggil Function Unit Returning Function`
    hellounit("John")
    hellounit(null)

    // Memanggil Function Return Type
    println(sum(1,2))

    // Memanggil Function Single Expression Function
    hi("John")
    println(mul(2))

    // Memanggil Function Varargs Parameter
    // val values = arrayOf(10,10,10,10)
    // print(values)
    val result = finalValue("Apple", 10, 10, 10)
    println(result)

    // Memanggil Function Extension Function
    val name: String = "Reihan"
    val hello: String = name.hello()
    println(hello)

    // Memanggil function Infix
    val upper: String = "Reihan".to("UP")
    println(upper)

    val lower: String = "Reihan".to("DOWN")
    println(lower)


// Function Scope
// Function scope adalah ruang lingkup dimana sebuah function bisa diakses
// Saat kita membuat function di dalam file kotlin, maka secara otomatis function tersebut bisa diakses dari file kotlin manapun
    fun sayHi(name: String):Unit{
        println("Hi!! $name")
    }
    // memanggil function Scope
    sayHi("John")

    // Memanggil function sayHallo
    // with parameter IF
    println(sayHalloIf("Raihan"))
    // without parameter IF
    println(sayHalloIf())

    // with parameter WHEN
    println(sayHalloWhen("Reihan"))
    // without parameter WHEN
    println(sayHalloWhen())

    // Memanggil Function Recursive
    println(factorialLoopRecursive(5))

    // Memanggil Function Tail Recursive
    display(5)
    factorialTail(5)

    // Mengeksekusi Lambda Expression
    val nameLam = lambdaName("Reihan")
    println(nameLam)
    // Memanggil Lambda Expression dengan it
    val nameLamIt = lambdaNameIt("Reihan")
    println(nameLamIt)
    // Memanggil Lambda Expression dengan method references
    val nameLamRef = lambdaNameRef("Reihan")
    println(nameLamRef)

    // Memanggil Higher-Order Function 
    val upperTransformer = { value: String -> value.uppercase() }
    val lowerTransformer = { value: String -> value.lowercase() }
    println(hello_HOF("Reihan", upperTransformer))
    println(hello_HOF("REIHAN", lowerTransformer))
    // Memanggil Higher-Order Function dengan Trailing Lambda
    val HOFLamd = hello_HOF("Reihan", { value: String -> value.uppercase() })
    println(HOFLamd)

    // Memanggil Function Anonymous
    val anonymous = anonymousFunctions("Reihan")
    println(anonymous)
    // Memanggil Anonymous Function dengan isi Blank
    val anonymousBlank = anonymousFunctions("")
    println(anonymousBlank)
    // Memanggil Anonymous Function dengan parameter
    val anonymousWithParam = hello_HOF("Ziyaad", anonymousFunctions)    
    println(anonymousWithParam)

    // Memanggil Closure
    lambdaIncrement()
    println(counter)

    // Memanggil Inline Function
    println(hello { "Reihan" })
    println(hello { "nudin" })

    // Memanggil Noinline Function
    println(helloNoinline ({ "Andrian" }, {"Reihannudin"}))
}