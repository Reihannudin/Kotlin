package app

import data.Members
import data.sayHello
import data.upperName

fun main() {
    val member = Members("Jin",23 )
    member.sayHello("Suga")

    println(member?.upperName)
}