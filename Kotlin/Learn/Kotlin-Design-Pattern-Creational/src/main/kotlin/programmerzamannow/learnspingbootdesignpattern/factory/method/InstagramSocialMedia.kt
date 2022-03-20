package programmerzamannow.learnspingbootdesignpattern.factory.method

class InstagramSocialMedia: SocialMedia {
    override val name: String?
        get() = "Instagram"
    override val link: String?
        get() = "https://www.instagram.com/"
    override val type: SocialMediaType
        get() = SocialMediaType.INSTAGRAM
}