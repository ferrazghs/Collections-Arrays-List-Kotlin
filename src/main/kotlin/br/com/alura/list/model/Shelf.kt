package br.com.alura.list.model

data class Shelf(
    val genre : String,
    val books : List<Book>
) {
    fun organizeByAuthor(): List<Book> {
        return books.sortedBy { it.author }
    }

    fun organizeByPublicationYear(): List<Book> {
        return books.sortedBy { it.publicationYear }
    }
}