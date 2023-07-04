package search

import search.data.Person
import search.engine.PeopleSearchEngine
import search.engine.SearchEngine

class ConsoleManager {

    fun run() {

        println("Enter the number of people:")
        println("Enter all people:")
        val persons = listOf(
            Person("Joseph", "Dwight", "djo@gmail.com"),
            Person("Katie", "Jacobs"),
            Person("Erick", "Harrington", "harrington@gmail.com"),
            Person("Rene", "Webb", "webb@gmail.com"),
            Person("Erick", "Test")
        )

        println("Enter the number of search queries:")
        val searchQueries = 3

        println("Enter data to search people:")
        val searchInput = "WEBB@gmail.com"

        printAnswer(PeopleSearchEngine(persons, searchInput))
    }

    private fun printAnswer(searchEngine: SearchEngine) {
        val results = searchEngine.find()

        if (results.isNotEmpty()) {
            println("People found:")
            results.forEach{ println(it) }
        }
        else println("No matching people found.")
    }

}