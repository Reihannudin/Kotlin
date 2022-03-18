package programmerzamannow.spring.cores.Cyclic

import programmerzamannow.spring.cores.data.Foo

class CyclicA {
// define private val from CyclicB
    private val CyclicB : CyclicB = CyclicB()

    //    make fun getter CyclicB
    fun getCyclicB() : CyclicB {
        return CyclicB
    }

}