package data

//Make Parrent Class
open class Teacher (val name: String){

    private fun teach() { // Private visibility : Just can used in this class or inherited
        println("Teacher $name is teaching")
    }

//    make visibility protected
    open protected fun student(){
        println("Student Name: $name ")
    }
}

// Override Child Class
class Student(name:String): Teacher(name){
//Visibility Modifier
//    override Function
    override public fun student(){
        super.student()
    }
}

