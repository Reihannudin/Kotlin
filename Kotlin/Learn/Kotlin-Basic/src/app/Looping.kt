fun main(){
    // For loop
    val names = arrayOf("Louis", "Niall", "Harry", "Zayn", "Liam")
    for (name in names){
        println(name)
    }

    // For Loop Range
    for (i in 1..10){
        println(i)
    }

    // While Loop
    var i = 0;
    while(i < 10){
        println("while loop $i")
        i++
    }

    // Do While Loop
    var b = 0;
    do{
        println("do while loop $b")
        b++
    }while(b < 10)


    // Break & Continue
    // Break
    var a = 0;
    while(true){
        println("$a")
        a++
        if(a > 200){
            println("Break")
            break
        }
    }

    // Continue
    for (values in 1..100){
        if (values%2 == 0){
            continue
        }
        print("$values ")
    }
    

}