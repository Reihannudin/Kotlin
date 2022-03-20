package programmerzamannow.learnspingbootdesignpattern.prototype

class Employee {

    private lateinit var id: String
//     make getters and setters
    fun getId(): String? {
        return id!!
    }

    fun setId(id: String?) {
        this.id = id!!
    }


    private lateinit var name: String
//     make getters and setters
    fun getName(): String {
    return name
}
    fun setName(name: String) {
        this.name = name
    }

    private lateinit var position : Position
//    make getters and setters
    fun getPosition(): Position {
        return position
    }
    fun setPosition(position: Position) {
        this.position = position
    }

    private var salary : Long = 0
//    make getters and setters
    fun getSalary(): Long {
        return salary
    }
    fun setSalary(salary: Long) {
        this.salary = salary
    }

    override fun toString(): String {
        return "Employee{" +
                "id='" + getId()!! + '\'' +
                ", name='" + getName() + '\'' +
                ", position=" + getPosition() +
                ", salary=" + getSalary() +
                '}'
    }


}