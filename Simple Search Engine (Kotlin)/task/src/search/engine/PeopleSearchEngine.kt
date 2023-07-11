package search.engine

import search.data.Person

class PeopleSearchEngine(private val persons: List<Person>) : SearchEngine {

    override fun find(searchInput: String): List<String> =
        findPersons(searchInput).map { it.toString() }

    private fun findPersons(searchInput: String): List<Person> =
        persons.filter { it.contains(searchInput) }

}
