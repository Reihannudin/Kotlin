package data

//make open class Shape
open class Shape {
//    declare open for properties overriding
    open val corner: Int = -1
//    make function name of shape
    open fun name(){
        println("This is Shape")
    }
}

//mmake child class from Shape
class Rectangle: Shape() {
//    override properties
    override val corner: Int = 4
//    make Super Keyword for accessing properties of parent class by using super keyword <Properties>
    val paramCorner:Int = super.corner
//    make overide function
    override fun name() {
        println("This is Rectangle")
    //    access parent class function by using super keyword <Function>
        super.name()
    }
}

//mmake child class from Shape
class Triangle : Shape() {
    //    override properties
    override val corner: Int = 3
}