package search

import search.data.Person
import search.engine.PeopleSearchEngine
import search.engine.SearchEngine

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
            when (readln()) {
                "1" -> {
                    println("Enter a name or email to search all suitable people.")
                    printAnswer(PeopleSearchEngine(persons, readln()))
                }

                "2" -> {
                    println("=== List of people ===")
                    printAllPeople(persons)
                }

                "0" -> {
                    println("Bye!")
                    return
                }
            }
        }
    }

    private fun printAllPeople(persons: List<Person>) {
        persons.forEach { println(it) }
    }

    private fun printAnswer(searchEngine: SearchEngine) {
        val results = searchEngine.find()

        if (results.isNotEmpty()) {
            println("People found:")
            results.forEach { println(it) }
        } else println("No matching people found.")
    }

}