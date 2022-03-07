package app
// make function with star projection
fun displayLength(array: Array<*>){
    println("The length of the array is ${array.size}")
}

fun main() {
    val arrayInt: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val arrayString: Array<String> = arrayOf("one", "two", "three", "four", "five")

    displayLength(arrayInt)
    displayLength(arrayString)
}
