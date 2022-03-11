package Kotlin.Unit.Test.app

import Kotlin.Unit.Test.app.resolver.RandomParameterResolver
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions

//Extend RandomParameterResolver
@Extensions(value = [
    ExtendWith(RandomParameterResolver::class)
])

abstract class ParentCalculatorTest {
//    define calculation
    val calculator = Calculator()

//    define beforeEach
    @BeforeEach
    fun beforeEach() {
        println("beforeEach")
    }

}
