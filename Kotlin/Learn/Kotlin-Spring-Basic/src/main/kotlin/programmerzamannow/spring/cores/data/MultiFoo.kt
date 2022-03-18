package programmerzamannow.spring.cores.data

import lombok.Getter
import org.springframework.beans.factory.ObjectProvider
import org.springframework.stereotype.Component
import java.util.stream.Collectors

@Component // define objectProvider
class MultiFoo(objectProvider : ObjectProvider<Foo?>){
    private val foos : List<Foo> //define foo and make a list
    init { // make init block
        foos = objectProvider.stream().collect(Collectors.toList()) as List<Foo> // make a list of foos
    }
//    make getter for foos
    fun getFoos() : List<Foo> {
        return foos
    }
}
