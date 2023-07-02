package search.data

import search.data.model.Word

class WordsData(line: String) {

    val words: List<Word> = line.split(" ").map { Word(it) }

}
