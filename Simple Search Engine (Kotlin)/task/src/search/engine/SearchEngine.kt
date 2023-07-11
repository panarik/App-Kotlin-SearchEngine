package search.engine

interface SearchEngine {

    fun find(searchInput: String):List<String>

}