package programmerzamannow.learnspingbootdesignpattern.factory.method

@Deprecated(message = "Use FacebookSocialMediaFactory instead")
class FacebookSocialMedia : SocialMedia {
    override val name: String?
        get() = "Facebook"

    override val link: String?
        get() = "https://www.facebook.com/"

    override val type: SocialMediaType
        get() = SocialMediaType.FACEBOOK

}
