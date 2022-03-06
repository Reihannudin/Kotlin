package data
//Make class and Make Constructor
class Car (paramModel: String, paramBrand: String, paramColor: String, paramYear: Int){

//    Initializer block
    init{
        println("Primary Constructor")
        println("Mobil: $paramModel-$paramBrand, berwarna $paramColor dan tahun $paramYear")
    }

//    Make Secondary Constructor
    constructor(paramModel: String, paramBrand: String, paramColor: String): this(paramModel, paramBrand, paramColor, 2022){
        println("Secondary Constructor 1")
        println("Mobil: $paramModel-$paramBrand, berwarna $paramColor ")
    }

//    Make Secondary Constructor 2
    constructor(paramModel: String, ParamBrand: String): this(paramModel, ParamBrand, ""){
        println("Secondary Constructor 2")
        println("Mobil: $paramModel-$ParamBrand")
    }


//    Declarate Properties
    var model: String = paramModel
    var brand:String = paramBrand
    var color:String = paramColor
    var year:Int = paramYear
}