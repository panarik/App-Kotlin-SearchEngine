package search.engine

import search.data.WordsData
import search.data.model.Word

class WordsSearchEngine(private val data: WordsData, private val input: Word) : SearchEngine {

    override fun find(): String {
        val result = data.words.indexOf(input)
        return if (result == -1) "Not found" else (result + 1).toString()
    }

}
