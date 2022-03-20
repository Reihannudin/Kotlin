package programmerzamannow.learnspingbootdesignpattern.factory.method

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Scope

@SpringBootApplication
class FactoryMethodeApplication {
    @Bean
    @Scope("prototype")
    fun socialMedia(type : SocialMediaType): SocialMedia {
        if (type == SocialMediaType.FACEBOOK) {
            return MetaSocialMedia()
        } else if (type == SocialMediaType.TWITTER) {
            return TwitterSocialMedia()
        } else if (type == SocialMediaType.INSTAGRAM) {
            return InstagramSocialMedia()
        } else {
            throw IllegalArgumentException("Unsupported social media type: ")
        }
    }
}