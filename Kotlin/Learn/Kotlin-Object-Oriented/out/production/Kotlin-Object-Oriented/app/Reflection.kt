package app

import annotations.NotBlank
import data.CreateProductRequest
import exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

//Validate the reflection
fun ValidateRequest(request: Any){
    val clazz = request::class
    val properties = clazz.memberProperties

    // iterate satu satu, lalu cek kalo ada annotation @NotBlank
    for (property in properties) {
        if (property.findAnnotation<NotBlank>() != null) {
            val value = property.call(request)
            when (value) {
                is String -> {
                    if ("" == value) {
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }
        }
    }
}

fun main() {
    val request = CreateProductRequest("1","Indomie", 3000)
    ValidateRequest(request)
}