package search

import search.data.WordsData
import search.data.model.Word
import search.engine.WordsSearchEngine

fun main() {

    val words = WordsData(readln())
    val input = Word(readln())
    val searchEngine = WordsSearchEngine(words, input)
    println(searchEngine.find())

}
