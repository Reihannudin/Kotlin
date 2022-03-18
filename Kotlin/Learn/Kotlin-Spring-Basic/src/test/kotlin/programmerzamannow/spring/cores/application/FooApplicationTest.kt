package programmerzamannow.spring.cores.application

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import programmerzamannow.spring.cores.application.FooApplication
import programmerzamannow.spring.cores.data.Foo

@SpringBootTest(classes = [FooApplication::class])
class FooApplicationTest {

    @Autowired
    lateinit var foo: Foo

    @Test
    fun testSpringTest(){
        Assertions.assertNotNull(foo)
    }

}