package app

import data.MyData
import data.MyDataMultiple

fun main() {
//    access Generic Type
//    with Generic data = String
    val myDataString: MyData<String> = MyData<String>("Reihan")
    myDataString.printData()

//    access Generic Type
//    with Generic data = Integer
    val myDataInt: MyData<Int> = MyData<Int>(10)
    myDataInt.printData()

//    access Generic Type multiple
    val myDataMul : MyDataMultiple<String, Int> = MyDataMultiple<String, Int>("Reihan", 10)
    myDataMul.printData()
//    also you can access the data like this
//        access Generic Type multiple
    val myDataMulCut  = MyDataMultiple("Reihan", 10)
    myDataMulCut.printData()
}