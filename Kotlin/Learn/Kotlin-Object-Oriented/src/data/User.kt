package data
//Make Properties Constructor
class User(var username:String,var password:String) {

//    make overide function toString
    override fun toString(): String {
        return "User(username='$username', password='$password')"
    }
}

//Properties Constructor can't ruining in Secondary Constructor

