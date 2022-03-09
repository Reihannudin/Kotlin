package app

fun main() {
//    make a list of strings
    val list: List<String> = listOf("Andrian", "Raihannudin")

//    use string representation to list
    val string1: String = list.joinToString(" ", "|", "|")
    println(string1) // output: |Andrian Raihannudin|

//    use string representation to list and convert to upperCase
    val string2: String = list.joinToString(" ", "|", "|").uppercase()
    println(string2) // output: |ANDRIAN RAIHANNUDIN|

//     String representation Appendable
//    add all string representation to list and add to appendable
    val appendable = StringBuilder()
    list.joinTo(appendable, " ", "{", "}")
    list.joinTo(appendable, " ", "|", "|")
    list.joinTo(appendable, " ", "<", ">")
    val string3: String = appendable.toString()
    println(string3) // output: {Andrian Raihannudin} |Andrian Raihannudin| <Andrian Raihannudin>

//    String representation in number
    val number: List<Int> = (1..100).toList()
    println(number.joinToString())
}