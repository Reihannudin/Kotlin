package data

class Note(title:String) {
//    make properties
    var title: String = title
//    make getter
//    WITHOUT BODY
//    get() = field
//    WITH BODY
    get(){
        println("Call Getter function")
        return field
    }
//    make setter
    set(value) {
//        field = value // basic Setter
//        Add validation
        println("Call Setter function")
        if (value.isNotEmpty()) {
            field = value
        } else {
            println("Title is empty")
        }
    }
}

//make class with VAL
class BigNote(val title: String){
    val  bigTitle: String
    get() = title.uppercase()
//    Can't use set bcs it's a val
//    set(value) {
//        field = value.uppercase()
//    }
}

