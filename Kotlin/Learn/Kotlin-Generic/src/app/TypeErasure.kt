package app

class TypeErasure<T>(param: T) {
    private val data: T = param
    fun getData(): T = data
}

fun main() {
    val data1 = TypeErasure<String>("Reihan")
    val dataString: String = data1.getData()
    println(dataString)

    val dat2: TypeErasure<Int> = data1 as TypeErasure<Int>
    val dataInt: Int = dat2.getData()
    println(dataInt)
}