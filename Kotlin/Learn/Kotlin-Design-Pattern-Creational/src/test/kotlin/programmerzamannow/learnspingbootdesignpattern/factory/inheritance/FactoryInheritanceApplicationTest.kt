package programmerzamannow.learnspingbootdesignpattern.factory.inheritance

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import programmerzamannow.learnspingbootdesignpattern.factory.method.SocialMedia

@SpringBootTest(classes = [FactoryInheritanceApplication::class])
class FactoryInheritanceApplicationTest {

    @Autowired
    lateinit var context : ApplicationContext

    @Test
    fun testFactoryInheritance(){
        val facebook = context.getBean("socialMediaFacebook", SocialMedia::class.java)
        val twitter = context.getBean("socialMediaTwitter", SocialMedia::class.java)
        val instagram = context.getBean("socialMediaInstagram", SocialMedia::class.java)

        println(facebook)
        println(twitter)
        println(instagram)
    }

}