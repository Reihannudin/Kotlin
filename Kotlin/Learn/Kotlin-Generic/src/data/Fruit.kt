package data

class Fruit(val name:String, val quantity:Int): Comparable<Fruit> {
    override fun compareTo(other: Fruit): Int {
        return this.quantity.compareTo(other.quantity)
    }
}
