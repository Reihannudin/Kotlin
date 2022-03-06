package data

//make sealed class
//digunakan untuk pewarisan
sealed class Operation (val name: String)

//inherit sub class dari sealed class
class Plus : Operation("Plus")
class Minus : Operation("Minus")
class Multiply : Operation("Multiply")
class Divide : Operation("Divide")