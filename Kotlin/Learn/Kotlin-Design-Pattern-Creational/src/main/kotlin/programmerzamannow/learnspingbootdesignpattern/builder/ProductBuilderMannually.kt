package programmerzamannow.learnspingbootdesignpattern.builder

//make builder mannually
class ProductBuilderMannually {
//     add atributes
    private lateinit var id : String
    private lateinit var name : String
    private  var price : Long = 0L
    private lateinit var description : String
    private lateinit var category: Category

//    make setter
    fun setId(id: String): ProductBuilderMannually {
        this.id = id
        return this
    }

    fun setName(name: String): ProductBuilderMannually {
        this.name = name
        return this
    }

    fun setPrice(price: Long): ProductBuilderMannually {
        this.price = price
        return this
    }

    fun setDescription(description: String): ProductBuilderMannually {
        this.description = description
        return this
    }

    fun setCategory(category: Category): ProductBuilderMannually {
        this.category = category
        return this
    }

    //   make build method
    fun build():Product {
        return Product(id, name, price, description, category)
    }

}