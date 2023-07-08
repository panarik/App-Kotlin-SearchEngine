package search

import search.config.ArgumentsConfig

fun main(args: Array<String>) {
    val data = ArgumentsConfig(args).getData()
    ConsoleManager(data).runMenu()
}
