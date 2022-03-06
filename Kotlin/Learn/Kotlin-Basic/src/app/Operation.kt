fun main(){

    // Basic operation Math
    var resultAdd : Int = 1 + 6
    println(resultAdd)
    var resultMin : Int = 1 - 6
    println(resultMin)
    var resultMul : Int = 2 * 6
    println(resultMul)
    var resultDev : Int = 6 / 2
    println(resultDev)

    // Augmented Assignments
    //  Operasi Matematika Augmented Assignments
    //      a = a + 10           a += 10
    var augmented: Int = 50
    var resultAug = 100

    // Add
    resultAug += augmented
    println(resultAug)

    // Min
    resultAug -= augmented
    println(resultAug)

    // Mul
    resultAug *= augmented
    println(resultAug)

    // Div
    resultAug /= augmented
    println(resultAug)

    // Unary Operator
    // ++ == a = a + 1
    resultAug++
    println(resultAug)

    // -- == a = a - 1
    resultAug--
    println(resultAug)

    // - == Negative
    val suhu = -5
    println(suhu)

    // + == Positive
    val count = +5
    println(count)

    // ! == Boolean kebalikan
    val sehat = true
    println(!sehat)

    // Operasi Perbandingan
    val a = 100
    val b = 50
    val c = 50

    // > Lebih Dari
    println(a > b)
    // < Kurang Dari
    println(a < b)
    // >= Lebih Dari Sama Dengan
    println(a >= c)
    // <= Kurang Dari Sama Dengan
    println(a <= c)
    // == Sama Dengan
    println(b == c)
    // != Tidak Sama Dengan
    println(b != c)
    
    // Operasi Boolean
    val finalExam = 80
    val attendance = 90

    val passFinalExam = finalExam >= 75
    val passAttendance = attendance >= 80

    // Operator Logika
    // && == Dan
    var pass = passFinalExam && passAttendance
    println(pass)

    // || == Atau
    pass = passFinalExam || passAttendance
    println(pass)

    // ! == Kebalikan
    pass = !passFinalExam
    println(pass)
    
}