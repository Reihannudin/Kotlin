package Kotlin.Unit.Test.app

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.condition.*

class ConditionalTest {
//    OS
//    make test enabled in windows
    @Test
    @EnabledOnOs(value= [OS.WINDOWS])
    fun enabledOnlyInWindows(){
        // only runs in windows operations
    }
//    make test enabled in windows and macOS operations
    @Test
    @EnabledOnOs(OS.WINDOWS, OS.MAC)
    fun enabledInWindowsAndMac(){
        // runs in windows and macOS operations
    }
//    make test disabled in windows OS
    @Test
    @DisabledOnOs(OS.LINUX)
    fun disabledInLinux(){
        // runs only in linux operations
    }
//    make test disabled in all macOS and Linux operating
    @Test
    @DisabledOnOs(OS.LINUX, OS.MAC)
    fun disabledInAllMacAndLinux(){
        // runs in all macOS and Linux operating systems
    }
//    JAVA
//    make test enabled only runs in on Java 16
    @Test
    @EnabledOnJre(value =[JRE.JAVA_16])
    fun enabledOnlyInJava16(){
        // only runs in Java 16
    }
//    make test only disabled runs in on Java 16
    @Test
    @DisabledOnJre(value=[JRE.JAVA_16])
    fun disabledOnlyInJava16(){
        // only runs if not in Java 16
    }
//    make test Enabled in range Javaversion
    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_16)
    fun enabledForJreRange(){
        // only runs in Java 8 to Java 16
    }
//    make test Disabled in range Javaversion
    @Test
    @DisabledForJreRange(min = JRE.JAVA_15, max = JRE.JAVA_17)
    fun disabledForJreRange(){
        // only runs if not in Java 15 to Java 17
    }

// System Properties
//    make function to show System Propeties in console
    @Test
    fun showSystemProperties(){
        System.getProperties().forEach {
            println("${it.key} = ${it.value}")
        }
    }
//   make function to check System properties
    @Test
    @EnabledIfSystemProperties(value = [
        EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    ])
    fun enabledOnOracle(){
        // only runs if java vendor is Oracle Corporation
    }
    //   make function to check enabledSystem properties
    @Test
    @DisabledIfSystemProperties(value = [
        DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    ])
    fun disabledOnOracle(){
        // only runs if java vendor is Oracle Corporation
    }

//    Environment
//   make function to check enabled Environment
    @Test
    @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "Dev")
    fun enabledOnDev(){
        // only runs if PROFILE is Dev
    }
    //   make function to check disabled Environment
    @Test
    @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "Dev")
    fun disabledOnDev(){
        // only runs if PROFILE is not Dev
    }

}

