package data

//Inline class must have exactly one primary constructor parameter
inline class Token (val value: String){
    fun toUpper(): String = value.uppercase()
}