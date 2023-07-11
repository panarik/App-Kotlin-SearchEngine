package search.engine

import search.data.Person

class NoneSearchEngine(private val persons: List<Person>) : SearchEngine {

    override fun find(searchInput: String): List<String> {
        TODO("Not yet implemented")
    }

}