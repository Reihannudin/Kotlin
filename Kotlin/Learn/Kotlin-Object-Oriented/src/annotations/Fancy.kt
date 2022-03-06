package annotations
//menargetkan hanya bisa di class
@Target(AnnotationTarget.CLASS)
//menargetkan agar bisa di compile dan dibaca
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented // bisa di dokumentasiin ngga? : Bisa
annotation class Fancy(val author: String)