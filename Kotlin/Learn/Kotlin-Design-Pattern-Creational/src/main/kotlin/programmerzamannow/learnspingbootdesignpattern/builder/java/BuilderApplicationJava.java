/*
package programmerzamannow.learnspingbootdesignpattern.builder.java;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import programmerzamannow.learnspingbootdesignpattern.builder.Category;
import programmerzamannow.learnspingbootdesignpattern.builder.Product;

@SpringBootApplication
public class BuilderApplication {

    @Bean
    @Scope("prototype")
    public ProductBuilderJava productGadget(){
        return Product.builder()
                .category(Category.GADGET)
                .build();
    }

    @Bean
    @Scope("prototype")
    public ProductBuilderJava productFashion(){
        return Product.builder()
                .category(Category.FASHION)
                .build();
    }
}*/
