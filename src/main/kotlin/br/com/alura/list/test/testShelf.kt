package br.com.alura.list.test

import br.com.alura.list.listBook
import br.com.alura.list.model.Shelf

fun main() {

    val shelfAuthor = Shelf("Literatura", listBook)

    shelfAuthor.organizeByAuthor().printBook()
    shelfAuthor.organizeByPublicationYear().printBook()
}
