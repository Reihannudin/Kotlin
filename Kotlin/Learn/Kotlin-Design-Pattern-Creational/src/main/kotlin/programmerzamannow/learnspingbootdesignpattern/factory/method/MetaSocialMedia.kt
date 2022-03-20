package programmerzamannow.learnspingbootdesignpattern.factory.method

class MetaSocialMedia : SocialMedia{
    override val name: String?
        get() = "Meta"
    override val link: String?
        get() = "https://www.meta.com/"
    override val type: SocialMediaType
        get() = SocialMediaType.FACEBOOK

}