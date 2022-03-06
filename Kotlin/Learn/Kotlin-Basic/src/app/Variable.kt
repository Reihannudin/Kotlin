// """
// Variable Constant adalah Immutable data, yang biasanya diakses untuk keperluan global.
// Global artinya bisa diakses dimanapun
// Untuk menandai bahwa variable tersebut adalah constant, biasanya menggunakan UPPER_CASE dalam pembuatan nama variable constant nya
// """
// Variable Constants
const val APP = "Samsan Tech"
const val APP_VERSION = "1.0.0"

fun main(){
//  Variable Mutable = Bisa di ubah
//  Variable Mutable = Syntax = <Var>
    var firstName : String = "Andrian"
    var lastName = "Reihannudin"

    // You can remove Comment
    // lastName = "Raihannudin"

    println("$firstName $lastName")

//  Variable Immutable = Tidak bisa di ubah
//  immutable = Syntax<Val>
    val age: Int = 19
    
    // This is will be  Error
    // age = 20
    println(age)

// Nullable
// """ 
// Secara standar, variable di Kotlin harus dideklarasikan / diinisialisasikan nilai nya
// Jika saat membuat variable, tidak diberi nilai, maka akan error
// Kotlin mendukung variable yang boleh null (tidak memiliki data)
// Ini dikarenakan Kotlin bisa mengakses Java, dan kebanyakan di Java, semua variable bisa null
// Untuk membuat variable bisa bernilai null, di Kotlin bisa menggunakan ? (tanda tanya) setelah tipe datanya.
// Penggunaan  fitur ini tidak direkomendasikan untuk dilakukan di kotlin, hanya sebagai jalan akhir jika misal mengakses kode Java
// """
    var name: String? = null
    println(name)

    // right syntax
    println(name?.length)

    // wrong syntax
    // println(name.length)

// print variable Constant
    println("Welcome to $APP");
    println("Version $APP_VERSION");
    
}