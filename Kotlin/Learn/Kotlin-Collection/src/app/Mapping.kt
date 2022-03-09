package app

fun main() {
//    make list of strings
    val list: List<String> = listOf("Jin", "Suga", "Jungkook","J-Hope","V","Jimin","RM")

//    uppercase list manually
//    val temp = mutableListOf<String>()
//    for (i in list) {
//        temp.add(i.uppercase())
//    }
//    println(temp)

//    uppercase list using map
//    val temp = list.map { value -> value.uppercase() }
//    also you can do it like this:
    val temp = list.map { it.uppercase() }
    println(temp)

//    lowercase set using map
    val set1 = setOf("Jin", "Suga", "Jungkook","J-Hope","V","Jimin","RM")
    val temp2 = set1.map { value -> value.lowercase()}
//    also you can do it like this:
//    val temp2 = list.map { it.lowercase() }
    println(temp2)

//    Ganjil name
    val members = listOf("Jin", "Suga", "Jungkook","J-Hope","V","Jimin","RM")
    val membersGanjil = members.mapIndexedNotNull{index, members ->
        if (index % 2 == 0) members else null
    }
    println(membersGanjil)

//    Ganjil number
    val numbers = (1..100).toList()
    val ganjil = numbers.mapNotNull {
        if (it%2 == 0) it else null
    }
    println(ganjil)

}