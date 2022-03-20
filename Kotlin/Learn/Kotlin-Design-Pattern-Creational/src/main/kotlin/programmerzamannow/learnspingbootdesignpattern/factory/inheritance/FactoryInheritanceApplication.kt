package programmerzamannow.learnspingbootdesignpattern.factory.inheritance

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Scope
import programmerzamannow.learnspingbootdesignpattern.factory.method.InstagramSocialMedia
import programmerzamannow.learnspingbootdesignpattern.factory.method.MetaSocialMedia
import programmerzamannow.learnspingbootdesignpattern.factory.method.SocialMedia
import programmerzamannow.learnspingbootdesignpattern.factory.method.TwitterSocialMedia

@SpringBootApplication
class FactoryInheritanceApplication {
    @Bean
    @Scope("prototype")
    fun socialMediaFacebook(): SocialMedia {
        return MetaSocialMedia()
    }

    @Bean
    @Scope("prototype")
    fun socialMediaTwitter(): SocialMedia {
        return TwitterSocialMedia()
    }

    @Bean
    @Scope("prototype")
    fun socialMediaInstagram(): SocialMedia {
        return InstagramSocialMedia()
    }


}