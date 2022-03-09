package app

fun main() {
    val list = listOf("a","a","c","b","c","c","b","b")
    val groupping: Grouping<String , String> = list.groupingBy { it }

//    use function eachCount
    println(groupping.eachCount())

//    make a reduce function
    val reduce = groupping.reduce { key, first, second ->
        first + second
    }
    println(reduce)

//    make a fold function
    val fold = groupping.fold("") { first, second ->
        first + second
    }
    println(fold)

//    make aggregate function
    val aggregate = groupping.aggregate { key, first:String?, second, isFirst ->
        if(isFirst) second
        else first+second
    }
    println(aggregate)

}
















