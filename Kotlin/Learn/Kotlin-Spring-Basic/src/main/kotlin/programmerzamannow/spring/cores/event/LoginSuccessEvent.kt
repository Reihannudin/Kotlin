package programmerzamannow.spring.cores.event

import lombok.Getter
import org.springframework.context.ApplicationEvent
import programmerzamannow.spring.cores.data.User

class LoginSuccessEvent(user: User) :ApplicationEvent(user) { //implementation ApplicationEvent


    @Getter
    private val user: User
    //     crete getter for user

    fun getUser(): User {
        return user
    }


    init {
        this.user = user
    }


}
