package programmerzamannow.spring.cores.aware

interface IdAware {
    fun setId(id: String)

    fun getId(): String
}