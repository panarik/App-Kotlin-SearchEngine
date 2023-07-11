package search.engine

import search.data.Person

class AllSearchEngine(private val persons: List<Person>) : SearchEngine {

    override fun find(searchInput: String): List<String> {
        var result = persons
        for (word in searchInput.split(" ")) {
            result = result.filter { it.contains(word) }
        }
        return result.map { it.toString() }
    }



}