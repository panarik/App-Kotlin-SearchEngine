package search.data

class Person(
    val firstName: String,
    val secondName: String,
    val mail: String? = null
) {

    fun contains(text: String): Boolean =
        (firstName + secondName + (mail ?: "")).contains(text, true)

    override fun toString(): String =
        "${this.firstName} " + this.secondName + if (this.mail != null) " ${this.mail}" else ""


}
