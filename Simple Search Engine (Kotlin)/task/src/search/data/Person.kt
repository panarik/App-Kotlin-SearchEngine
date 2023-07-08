package search.data

class Person(
    val firstName: String,
    val secondName: String? = null,
    val mail: String? = null
) {

    fun contains(text: String): Boolean =
         this.firstName.lowercase() == text.lowercase() ||
                (this.secondName?.lowercase() ?: "") == text.lowercase() ||
                (this.mail?.lowercase() ?: "") == text.lowercase()

    override fun toString(): String {
        val result = StringBuilder(this.firstName)
        result.append(if (this.secondName != null) " ${this.secondName}" else "")
        result.append(if (this.mail != null) " ${this.mail}" else "")
        return result.toString()
    }

}
