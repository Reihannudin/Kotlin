package app

class Invariant <T>(var data: T)

fun main() {
    val invariantString = Invariant<String>("Hello")
    println(invariantString.data)

//    invariant can't be reassigned
//    example:
//    val invariantAny: Invariant<Any> = invariantString // can't be reassigned will error bcs there different type data
//    invariantAny.data = 78
//
//    println(invariantAny.data)
}