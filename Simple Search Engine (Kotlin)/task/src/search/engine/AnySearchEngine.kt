package search.engine

import search.data.Person

class AnySearchEngine(private val persons: List<Person>) : SearchEngine {

    override fun find(searchInput: String): List<String> {
        val result = mutableListOf<String>()
        for (searchWord in searchInput.split(" ")) {
            for (person in persons) {
                if (person.contains(searchWord)) result.add(person.toString())
            }
        }
        return result
    }

}