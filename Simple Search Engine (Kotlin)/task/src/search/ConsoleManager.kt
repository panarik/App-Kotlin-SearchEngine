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

            val menuInput = readln().toInt()
            if (menuInput == 0) {
                println("Bye!")
                return
            } else runSearch(menuInput)
        }
    }

    private fun runSearch(menuInput: Int) {
        println("Select a matching strategy: ALL, ANY, NONE")
        val searchType = readln()
        when (menuInput) {
            1 -> {
                println("Enter a name or email to search all suitable people.")
                printAnswer(SearchEngineFactory().create(searchType, persons).find(readln()))
            }

            2 -> {
                println("=== List of people ===")
                persons.forEach { println(it) }
            }
        }
    }

    private fun printAnswer(results: List<String>) {
        if (results.isNotEmpty()) {
            println("People found:")
            results.forEach { println(it) }
        } else println("No matching people found.")
    }

}