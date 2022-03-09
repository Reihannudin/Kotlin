package app

fun main() {
//    make a variable with range and shuffled list
    val numbers = (1..100).toList().shuffled()

//    make reduce max function
    val max = numbers.reduce { first, second ->
        if (first > second) first
        else second
    }
    println(max)

//    make reduce min function
    val min = numbers.reduce { first, second ->
        if (first < second) first
        else second
    }
    println(min)

//    make fold sum function
    val sum = numbers.fold(0) {first, second ->
        first + second
    }
    println(sum)
    println(numbers.sum())

//    make fold count index name
    val name = listOf("Andrian","Raihannudin")
    val count = name.fold(0) {first, second ->
        first + 1
    }
    println(count)
    println(name.count())


}