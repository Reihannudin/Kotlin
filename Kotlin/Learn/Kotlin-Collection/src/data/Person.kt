package data
//bcs all function override to class in  class have all function
class Person(val name: String) {
//make function hashCode
    override fun hashCode(): Int {
        return name.hashCode()
    }
//make override function equals
    override fun equals(other: Any?): Boolean = when(other){
        is Person -> name == other.name
        else -> false
    }
//    make override function toString
    override fun toString(): String {
        return "Person(name='$name')"
    }
}