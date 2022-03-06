package data
//Make Class
class Address {
//     Declarate Properties
    var street: String? = ""
    var city: String = ""
    var country: String = "Indonesia"

//    Make Secondary Constructor Without Primary Constructor
    constructor(paramStreet: String, paramCity: String) {
        street = paramStreet
        city = paramCity
    }

//    Make Secondary Constructor 2  from Secondary Constructor 1
    constructor(paramStreet: String, paramCity: String, paramCountry: String) : this(paramStreet, paramCity) {
        country = paramCountry
    }
}