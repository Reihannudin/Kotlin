package app

import data.MyBase
import data.MyBaseDelegate
import data.MyBaseDelegateAuto

fun main() {
//   call basic function
    val base = MyBase()
    base.sayHello("Ziyad")

    println("Manual delegation")
//    implement delegation pattern <Manual
    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Reihan")
    baseDelegate.sayGoodBye("Reihan")

    println("Auto delegation")
//    implement delegation pattern <Auto
    val baseDelegateAuto = MyBaseDelegateAuto(base)
    baseDelegateAuto.sayHello("Reihan")
    baseDelegateAuto.sayGoodBye("Reihan")


}