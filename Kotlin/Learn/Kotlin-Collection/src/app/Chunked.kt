package app

fun main() {
    val numbers = (1..100).toList()
//    Make chunked list of 10 elements
    val list1 = numbers.chunked(10)
    println(list1.size)
    println(list1)

//    Make Statement with chunked list
    val list2 = numbers.chunked(10) { values ->
        var total = 0
        for (value in values) {
            total += value
        }
        total
    }
    println(list2)
}