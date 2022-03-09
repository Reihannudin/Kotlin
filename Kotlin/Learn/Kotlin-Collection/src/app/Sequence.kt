package app

fun main() {
    val words = "the quick brown fox jumps over the lazy dog".split(" ")

println("non sequence")
//    make non Sequence
    val result = words
        .filter {
            println("filter $it")
            it.length > 3
        }
        .map {
            println("map $it")
            it.uppercase()
        }
        .take(4)
    println(result)

    println("===============")

    println("sequence")
//    make list to be sequence
    val sequence = words.asSequence()
//make sequence
    val resultSequence = sequence
        .filter {
            println("filter $it")
            it.length > 3
        }
        .map {
            println("map $it")
            it.uppercase()
        }
        .take(4)
    println(resultSequence.toList())
}