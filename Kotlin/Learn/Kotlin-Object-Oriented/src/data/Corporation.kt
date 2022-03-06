package data

class Corporation(val name: String) {

//    refrence to String
//  make overide function toString
    override fun toString(): String {
        return "Corporation(name='$name')"
}

//    make overide equals functions
    override fun equals(other: Any?): Boolean{
        return when(other){
            is Corporation -> other.name == this.name
            else -> false
        }
    }

//    refrence to Int
//    make overide hashCode functions
    override fun hashCode(): Int {
        return name.hashCode()
    }
}