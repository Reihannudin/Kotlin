package programmerzamannow.learnspingbootdesignpattern.factory.method

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext

@SpringBootTest(classes = [FactoryMethodeApplication::class])
class FactoryMethodeApplicationTest {

    @Autowired
    lateinit var context : ApplicationContext

    @Test
    fun testFactoryMethod(){
        val facebook : SocialMedia = context.getBean(SocialMedia::class.java, SocialMediaType.FACEBOOK)
        val twitter : SocialMedia = context.getBean(SocialMedia::class.java, SocialMediaType.TWITTER)
        val instagram : SocialMedia = context.getBean(SocialMedia::class.java, SocialMediaType.INSTAGRAM)

        println(facebook)
        println(twitter)
        println(instagram)
    }
}