package programmerzamannow.spring.cores

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DatabaseTest {
//     make test Database if same
    @Test
    fun singletonTest(){
    // define database from Database class and get instance
        val database1 = Database.getInstance()
        val database2 = Database.getInstance()
//    make assertions if same
        Assertions.assertEquals(database1, database2)
    }

}