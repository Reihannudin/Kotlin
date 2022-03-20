package programmerzamannow.learnspingbootdesignpattern.build

import org.junit.jupiter.api.Test
import programmerzamannow.learnspingbootdesignpattern.builder.Category
import programmerzamannow.learnspingbootdesignpattern.builder.ProductBuilderMannually

class ProductBuilderMannuallyTest {
//    add Test
    @Test
    fun testBuilderMannually() {
        val product = ProductBuilderMannually()
                .setId("A67E5")
                .setName("Iphone 13 Pro")
                .setPrice(20_000_000)
                .setDescription("Iphone 13 Pro with Ram 16 GB, Storage 256 GB, Color Black")
                .setCategory(Category.GADGET)
                .build()
        println(product)
    }

}