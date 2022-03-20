package programmerzamannow.learnspingbootdesignpattern.factory.method

class TwitterSocialMedia : SocialMedia {
    override val name: String?
        get() = "Twitter"
    override val link: String?
        get() =  "https://twitter.com/"
    override val type: SocialMediaType
        get() =  SocialMediaType.TWITTER
}