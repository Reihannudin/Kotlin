package app
//making the class
class Member(val name: String, val hobbies:  List<String>)

fun main() {
//    make nested list
    val list: List<List<String>> = listOf(
//        NestedList
        listOf("Andrian", "Raihannudin"),
        listOf("Andrian", "Raihannudin"),
        listOf("Andrian", "Raihannudin"),
    )
//    accses flatten for nested list
    val listString: List<String> = list.flatten()
//    will print the nested list
    println(listString)

    val members: List<Member> = listOf(
        Member("Andrian", listOf("Coding","Traveling","Sleeping")),
        Member("Ziyad", listOf("Eating", "Gaming","Reading"))
    )
//    accses flatten for nested list
//    val hobies = members.map { it.hobbies }.flatten() // manualy with mappings
    val hobies: List<String> = members.flatMap{ it.hobbies } // with flatmap
//    will print all hobbies
    println(hobies)
}