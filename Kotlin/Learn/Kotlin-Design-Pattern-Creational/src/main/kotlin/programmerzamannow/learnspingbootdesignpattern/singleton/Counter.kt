package programmerzamannow.learnspingbootdesignpattern.singleton

class Counter {
//    make variable value it private to make it singleton
    private var value: Long = 0L
//    make getter value
    fun getValue(): Long {
        return value
    }
//    make increment synchronized
    @Synchronized
    fun increment() {
        value++
    }

}