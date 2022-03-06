fun main(){
    // make typeData

    // TypeData<Number>
    // TypeData<Int>    
    val integer: Int = 30
    // TypeData<Double>
    val double: Double = 3.889
    // TypeData<Float>
    val float: Float = 4.0f
    // TypeData<Long>
    val long: Long = 500_000_000_000L
    // TypeData<Short>
    val short: Short = 2000

    // print Type data Number
    println(integer)
    println(double)
    println(float)
    println(long)
    println(short)

    
    // TypeData<Conversion>
    // Konversi dari Int ke String
    val intToString: String = integer.toString()
    // konversi Dari Double ke Int
    val doubleToInt: Int = double.toInt()
    // konversi Dari Float ke Int
    val floatToInt : Int = float.toInt()

    println(intToString)
    println(doubleToInt)
    println(floatToInt)

    // TypeData<Char>
    var char1: Char = 'I';
    println(char1)

    // TypeData<Boolean>
    val booleanT: Boolean = true 
    val booleanF : Boolean = false

    println(booleanT)
    println(booleanF)

    // TypeData<String>
    var string: String = "Ini adalah String"
    println(string)


    // TypeData<StringTrimMargin>
    val stringTrimMargin: String = """
        Hello, ini adalah stringTrimMargin
        TrimMargin digunakan ketika ingin membuat text 
        dengan ukuran yang banyak
    """.trimMargin()

    println(stringTrimMargin)

    // TypeData<JoiningString>
    var firstString: String = "Andrian"
    var secondString: String = "Reihannudin"
    var fullName: String = firstString +" "+secondString

    println(fullName)

    // TypeData<StringTemplate>
    var fullNameTemplate: String = "$firstString $secondString"
    println(fullNameTemplate)

    // TypeData<Range>
    // """ 
    // Kadang kita ingin membuat array yang berisi data yang angka berurutan
    // Membuat array dengan jumlah data sedikit mungkin mudah, tapi bagaimana jika data angka yang berurutannya sangat banyak, misal dari 1 sampai 1000
    // Cara membuat range denganmenggunakan tanda .. (titik dua kali) :
    // 0..10 : Range dari 0 sampai 10    
    // """
    // Kode: membuat Range
    // val range = 0..100

    // Kode : Range Terbalik
    // val range = 100 downTo 0

    // Kode : Range Dengan Step
    val range = 0..100 step 5
    // val range = 100 downTo 0 step 5


    // print range
    println("range: $range")
    //  count() = Mendapatkan total data di range
    println(range.count())
    //  contains(value) = Mengecek apakah terdapat value tersebut
    println(range.contains(500))
    //  first = Mendapatkan nilai pertama
    println(range.first())
    //  last = Mendapatkan nilai terakhir
    println(range.last())
    // step = Mendapatkan nilai tiap kenaikan
    println(range.step)

}