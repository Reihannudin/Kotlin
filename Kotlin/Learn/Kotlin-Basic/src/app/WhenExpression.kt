fun main(){
    // When Expression
    val finalExam = "A"
    when (finalExam) {
        "A" -> println("You passed the exam")
        "B" -> println("You passed the exam")
        "C" -> println("You passed the exam")
        "D" -> println("You passed the exam")
        "F" -> println("You failed the exam")
        else -> println("You failed the exam")
    }

    //  When Expression Multiple Option
    val grade = "C"
    when (grade){
        "A","B","C" -> println("You passed the exam")
        "D","F" -> println("You failed the exam")
        else -> println("You failed the exam")
    }

    // When Expression In
    val grade1 = "D"
    val passValues = arrayOf("A","B","C")
    val failedValues = arrayOf("D","F")
    when (grade1){
        in passValues -> println("You passed the exam")
        in failedValues -> println("You failed the exam")
        else -> println("You failed the exam")
    }

    //  When Expression Is
    val name = "Reihan"
    when (name){
        is String -> println("This is string")
        !is String -> println("This is not string")
    }

    // when Expression as If Expression
    val examValues = 90
    when {
        examValues >= 90 -> println("You passed the exam")
        examValues >= 80 -> println("You passed the exam")
        examValues >= 70 -> println("You passed the exam")
        else -> println("You failed the exam")
    }

}