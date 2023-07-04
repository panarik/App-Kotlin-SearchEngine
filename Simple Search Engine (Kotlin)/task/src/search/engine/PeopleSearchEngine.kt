package search.engine

import search.data.Person

class PeopleSearchEngine(private val persons: List<Person>, private val searchInput: String) : SearchEngine {

    override fun find(): List<String> =
        findPersons().map { it.toString() }

    private fun findPersons(): List<Person> =
        persons.filter { it.contains(searchInput) }

}
