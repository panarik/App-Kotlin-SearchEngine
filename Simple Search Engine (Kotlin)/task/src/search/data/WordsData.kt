package search.data

import search.data.model.Word

class WordsData(private val input: String) {

    val words: List<Word> = input.split(" ").map { Word(it) }

}