package search

import search.data.Person
import search.engine.SearchEngineFactory

class ConsoleManager(private val persons: List<Person>) {

    fun runMenu() {
        while (true) {
            println(
                "" +
                        "\n=== Menu ===\n" +
                        "1. Find a person\n" +
                        "2. Print all people\n" +
                        "0. Exit"
            )

            val menuInput = readln()
            if (menuInput == "0") {
                println("Bye!")
                return
            } else runSearch(menuInput)
        }
    }

    private fun runSearch(menuInput: String) {
        when (menuInput) {
            "1" -> {
                println("Select a matching strategy: ALL, ANY, NONE")
                val searchType = readln()
                println("Enter a name or email to search all suitable people.")
                printAnswer(SearchEngineFactory().create(searchType, persons).find(readln()))
            }

            "2" -> {
                println("=== List of people ===")
                persons.forEach { println(it) }
            }
            else -> throw IllegalArgumentException("Choose 1 or 2 or 3.")
        }
    }

    private fun printAnswer(results: List<String>) {
        if (results.isNotEmpty()) {
            println("${results.size} persons found:")
            results.forEach { println(it) }
        } else println("No matching people found.")
    }

}