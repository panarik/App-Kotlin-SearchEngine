package search.engine

import search.data.Person

class NoneSearchEngine(private val persons: List<Person>) : SearchEngine {

    override fun find(searchInput: String): List<String> {
        val result = mutableListOf<String>()
        for (person in persons) {
            var hasNotMatch = true
            for (searchWord in searchInput.split(" ")) {
                if (person.contains(searchWord)) hasNotMatch = false
            }
            if (hasNotMatch) result.add(person.toString())
        }

        return result
    }

}