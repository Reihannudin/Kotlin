package data

class Laptop(val name:String) // This is will be any class

//We inherit the class
open class Handphone(val name:String) // This is will be any class

class SmartPhone(name:String, val os: String) : Handphone(name) // This is intheritence from Class Handphone