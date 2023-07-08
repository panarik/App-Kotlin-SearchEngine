package search.config

import search.data.Person
import java.io.File

class ArgumentsConfig(private val args: Array<String>) : Config {

    override fun getData(): List<Person> =
        File(getPath()).readLines().map { parseToPerson(it) }


    private fun getPath(): String =
        getArgument("--data")

    private fun getArgument(argumentName: String): String {
        val argumentIndex = args.indexOf(argumentName)
        return if (argumentIndex == -1) throw IllegalArgumentException("Cant find argument $argumentName.")
        else args[argumentIndex + 1]
    }

    private fun parseToPerson(input: String): Person {
        val data = input.split(Regex("\\s+"))
        return when (data.size) {
            3 -> Person(data[0], data[1], data[2])
            2 -> Person(data[0], data[1])
            1 -> Person(data[0])
            else -> {
                throw IllegalArgumentException(input)
            }
        }

    }
}