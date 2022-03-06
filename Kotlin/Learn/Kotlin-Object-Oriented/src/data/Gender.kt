package data

//Enum class adalah data yang tetap yang tidak akan diubah
enum class Gender(val description: String) {//make propeties in enum
    MALE("Male"),
    FEMALE("Female");

//    make function enum
    fun showDescription(){
        println(description)
    }
}