package search.config

import search.data.Person

interface Config {

    fun getData():List<Person>

}