package Kotlin.Unit.Test.app.resolver

import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.api.extension.ParameterContext
import org.junit.jupiter.api.extension.ParameterResolver
import java.util.*

//make class RandomParameterResolver extend ParameterResolver
class RandomParameterResolver : ParameterResolver {

//    define random parameter
    private val random: Random = Random()

//    override function
    override fun supportsParameter(parameterContext: ParameterContext?, extensionContext: ExtensionContext?): Boolean {
        return parameterContext!!.parameter.type == Random::class.java
    }
//override function
    override fun resolveParameter(parameterContext: ParameterContext?, extensionContext: ExtensionContext?): Any {
        return random
    }
}