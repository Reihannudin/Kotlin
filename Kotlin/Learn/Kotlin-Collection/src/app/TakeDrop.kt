package app

fun main() {
//    make chars with range a - z and make to List
    val chars : List<Char> = ('a'..'z').toList()
//Take operator
//    take 3 first chars from list
    println(chars.take(3))
//    take 3 last chars from list
    println(chars.takeLast(3))
//    Take chars "< f" from list
    println(chars.takeWhile { it <'f' })
//    Take chars "> w" from list
    println(chars.takeLastWhile { it >'w' })

//    Drop operator
//    drop 3 first chars from list
    println(chars.drop(3))
//    drop 3 last chars from list
    println(chars.dropLast(3))
//    Drop chars "< f" from list
    println(chars.dropWhile { it <'f' })
//    Drop chars "> f" from list
    println(chars.dropLastWhile { it >'f' })
}


