package programmerzamannow.spring.cores.data

import org.springframework.stereotype.Component
import programmerzamannow.spring.cores.aware.IdAware

// add Component
@Component
class Car : IdAware{
//    make private field
    private var id: String = ""

//    make getter id
override fun getId(): String {
        return id
    }

//    override setId
    override fun setId(id: String) {
        this.id = id
    }
}