package app

import data.Student
import data.Teacher

fun main() {
    val teacher = Teacher("John")
    println(teacher.name)

    val student = Student("Doe")
    student.student()

//    Error bcs this is private
//    teacher.teach()
}