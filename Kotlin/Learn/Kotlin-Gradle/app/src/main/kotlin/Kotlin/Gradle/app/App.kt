/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package Kotlin.Gradle.app

//import belajar.gradle.model.Product

import Kotlin.Gradle.utilities.StringUtils
import com.google.gson.Gson // google Gson

import org.apache.commons.text.WordUtils

fun main() {
//    running MessageUtils
    val tokens = StringUtils.split(MessageUtils.getMessage())
    val result = StringUtils.join(tokens)
    println(WordUtils.capitalize(result))
//running main.kt
    val tokens2 = StringUtils.split(MainClass.learn())
    val result2 = StringUtils.join(tokens2)
    println(WordUtils.capitalize(result2))

//    add Gson Library
    val gson = Gson()

//    val product = Product()


}