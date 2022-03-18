package programmerzamannow.spring.cores.scope

import org.springframework.beans.factory.ObjectFactory
import org.springframework.beans.factory.config.Scope
import java.lang.Runnable
import java.util.ArrayList

class DoubletoneScope : Scope {
//    make private list
    private val objects: MutableList<Any> = ArrayList(2)
//    make private counter type date = long
    private var counter = -1L
    override fun get(name: String, objectFactory: ObjectFactory<*>): Any {
        counter++ //increment counter
        return if (objects.size == 2) { //if objects size is 2
            val index = (counter % 2).toInt() //get index
            objects[index] //return object
        } else {
            val `object` = objectFactory.getObject() //get object
            objects.add(`object`) //add object to list
            `object` //return object
        }
    }

    override fun remove(name: String): Any? { //remove object
        return if (!objects.isEmpty()) { //if objects is not empty
            objects.removeAt(0) //remove object
        } else null //return null
    }

    override fun registerDestructionCallback(name: String, callback: Runnable) {}

    override fun resolveContextualObject(key: String): Any? {
        return null
    }

    override fun getConversationId(): String? {
        return null
    }
}