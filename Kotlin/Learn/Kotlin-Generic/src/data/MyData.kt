package data
//Make class with diamond generic operator as T
class MyData<T>(val firstData: T) {
//    Make function declarate firstData
    fun getData(): T = firstData
//    make function printData
    fun printData() {
        println("Data is $firstData")
    }
}

//Make class with Multiple data Diamond generic operator as T and U
class MyDataMultiple<T, U>(val firstData: T, val secondData: U){
//    make function declarate firstData and secondData
    fun getfirstData(): T = firstData
    fun getsecondData(): U = secondData
//    make function printData
    fun printData() {
        println("first Data is $firstData and Second data $secondData")
    }

}
