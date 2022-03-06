package data

// make class Member
class Members(val name: String, val age : Int)

//    make Extension Function
    fun Members.sayHello(name: String) {
    if (this != null) { // nullable check
        println("Hello $name, my name is ${this.name} and my age is ${this.age}")
    }
}

//make Extension properties
val Members.upperName: String
    get() = this.name.uppercase()


