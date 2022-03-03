// Import 
// Jika kita ingin mengakses file Kotlin yang berada diluar package, maka kita bisa menggunakan Import
// Saat melakukan import, kita bisa memilih ingin meng-import bagian tertentu, atau semua file

import reedb.util.sayHello

fun main(){
    sayHello("Ziyaad")
    reedb.util.sayHello("Andrian", "Raihannudin")
}