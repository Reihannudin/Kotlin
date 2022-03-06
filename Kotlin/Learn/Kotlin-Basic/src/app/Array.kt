// """
// Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
// Tipe data array di Kotlin direpresentasikan dengan kata kunci Array
// """


fun main(){
    // Def Array
    val  members : Array<String> = arrayOf("RM", "J-HOPE", "JIN","SUGA","V", "JUNGKOOK", "JIMIN")
    val values: Array<Int> = arrayOf(1,2,3,4,5,6,7)
    val balance : Array<Int> = arrayOf(10_000, 20_000, 30_000)

    // print array
    println(balance)

    // Mengambil index ke 3 = Suga
    println(members[3])
    println(values[5])

    // Operation of array
    // size =  Untuk mendapatkan panjang Array
    println(members.size)

    // Get(index) = Mendapat data di posisi index
    val Jungkook: String = members.get(5)
    println(Jungkook)

    // Set(index, values) =  Mengubah data di posisi index
    val names: Array<String> = arrayOf("Eko", "Joko", "Budi")
    var setArray = names.set(0, "Rudi")
    println(setArray)

    // [index] = value = Mengubah data di posisi index
    names[0] = "Reihan"
    println(names[0])
    print(names)

    // Array Nullable =Secara standard data di Array di Kotlin tidak boleh null
    // Jika kita butuh membuat Array yang datanya boleh null, kita bisa menggunakan ? (tanda tanya)

    val nullable: Array<String?> = arrayOfNulls(5)
    nullable[0] = "Eko"
    nullable[1] = "Eko"
    nullable[2] = "Eko"
    nullable[3] = null
    nullable[4] = "Eko"
    println(nullable.size)

}