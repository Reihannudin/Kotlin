package app

import data.Developer
import data.Employee
import data.ProductManager

fun main() {
    var employee: Employee = Employee("John")
    employee.sayHello("Ziyaad")

    employee = ProductManager("Ziyaad")
    employee.sayHello("Udin")

    employee = Developer("Reihan")
    employee.sayHello("Ziyaad")
}