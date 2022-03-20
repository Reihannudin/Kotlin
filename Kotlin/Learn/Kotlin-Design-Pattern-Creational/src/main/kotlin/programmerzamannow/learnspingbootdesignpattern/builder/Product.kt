package programmerzamannow.learnspingbootdesignpattern.builder

import lombok.Builder
@Builder
class Product {

    private lateinit var id: String

    //    make getter and setter
    fun getId(): String {
        return id
    }

    fun setId(id: String) {
        this.id = id
    }

    private lateinit var name: String

    //    make getter and setter
    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    private var price: Long = 0

    //    make getter and setter
    fun getPrice(): Long {
        return price
    }

    fun setPrice(price: Long) {
        this.price = price
    }

    private lateinit var description: String

    //    make getter and setter
    fun getDescription(): String {
        return description
    }

    fun setDescription(description: String) {
        this.description = description
    }

    private lateinit var category: Category

    //    make getter and setter
    fun getCategory(): Category {
        return category
    }

    fun setCategory(category: Category) {
        this.category = category
    }


    //    make secondary constructor
    constructor(id: String, name: String, price: Long, description: String, category: Category) {
        this.id = id
        this.name = name
        this.price = price
        this.description = description
        this.category = category
    }

    //    to String
    override fun toString(): String {
        return "ProductBuilderJava(id='$id', name='$name', price=$price, description='$description'. category=$category)"
    }

}
