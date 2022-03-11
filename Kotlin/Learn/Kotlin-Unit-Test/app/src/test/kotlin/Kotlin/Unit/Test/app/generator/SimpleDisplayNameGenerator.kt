package Kotlin.Unit.Test.app.generator

import org.junit.jupiter.api.DisplayNameGenerator
import java.lang.reflect.Method

//make display name generator
class SimpleDisplayNameGenerator : DisplayNameGenerator {
    override fun generateDisplayNameForClass(testClass: Class<*>?): String {
        return "Test for ${testClass?.simpleName}"
    }

    override fun generateDisplayNameForNestedClass(nestedClass: Class<*>?): String {
        return "Test for ${nestedClass?.simpleName}"
    }

    override fun generateDisplayNameForMethod(testClass: Class<*>?, testMethod: Method?): String {
        return "Test for ${testClass?.simpleName}.${testMethod?.name}"
    }

}
