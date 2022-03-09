package app

fun main() {
//    make list
    val band: List<String> = listOf("One Direction", "BTS","BlackPink")
    val fans: List<String> = listOf("Directioner","Army","Blinks")

//    zippping all the list
    val list: List<Pair<String, String>> = band.zip(fans)
    println(list)

//    zippping all the list with add some description
    val list2: List<String> = band.zip(fans) { band, fans ->
        "This is the band $band and $fans is the fans"
    }
    println(list2)
}