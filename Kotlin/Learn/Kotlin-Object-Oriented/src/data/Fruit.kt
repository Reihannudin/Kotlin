package data

data class Fruit (val Quantity: Int){
    operator fun plus(fruit: Fruit): Fruit {
        return Fruit(this.Quantity + fruit.Quantity)
    }

    operator fun minus(fruit: Fruit): Fruit {
        return Fruit(this.Quantity - fruit.Quantity)
    }
}