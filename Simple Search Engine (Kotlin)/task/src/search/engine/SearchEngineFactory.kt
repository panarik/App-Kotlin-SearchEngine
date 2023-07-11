package search.engine

import search.data.Person

class SearchEngineFactory {

    fun create(type: String, persons: List<Person>): SearchEngine =
        when (type) {
            "ALL" -> AllSearchEngine(persons)
            "ANY" -> AnySearchEngine(persons)
            "NONE" -> NoneSearchEngine(persons)
            else -> throw IllegalArgumentException("Wrong search type.")
        }

}