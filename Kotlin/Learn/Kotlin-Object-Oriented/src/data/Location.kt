package data

//jika sudah abstract tidak perlu menambahkan open untuk inheritance
abstract class Location(val name: String)

//inheritance from class location
class City(name: String) : Location(name)

//inheritance from class location
class Country(name: String) : Location(name)