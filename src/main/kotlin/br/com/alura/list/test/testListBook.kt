package br.com.alura.list

import br.com.alura.list.model.Book
import br.com.alura.list.test.printBook


val listBook: List<Book> = mutableListOf(
    Book(
        title = "Grande Sertão: Veredas",
        author = "João Guimarães Rosa",
        publicationYear = 1956
    ),

    Book(
        title = "Minha vida de menina",
        author = "Helena Morley",
        publicationYear = 1942,
        publishing = "Editora A"
    ),

    Book(
        title = "Memórias Póstumas de Brás Cubas",
        author = "Machado de Assis",
        publicationYear = 1881
    ),

    Book(
        title = "Iracema",
        author = "José de Alencar",
        publicationYear = 1865,
        publishing = "Editora B"
    ),

    Book(
        title = "Sagarana",
        author = "João Guimarães Rosa",
        publicationYear = 1946
    )

)

val listBookNull: List<Book?> = mutableListOf(
    null,
    Book(
        title = "Grande Sertão: Veredas",
        author = "João Guimarães Rosa",
        publicationYear = 1956
    ),
    null,
    Book(
        title = "Minha vida de menina",
        author = "Helena Morley",
        publicationYear = 1942,
        publishing = "Editora A"
    ),
    Book(
        title = "Memórias Póstumas de Brás Cubas",
        author = "Machado de Assis",
        publicationYear = 1881
    ),
    null,
    Book(
        title = "Sagarana",
        author = "João Guimarães Rosa",
        publicationYear = 1946
    ),
    Book(
        title = "Iracema",
        author = "José de Alencar",
        publicationYear = 1865,
        publishing = "Editora B"
    ),
    Book(
        title = "Vidas Secas",
        author = "Graciliano Ramos",
        publicationYear = 1938,
        publishing = "Editora A"
    ),
    Book(
        title = "Mayombe",
        author = "Pepetela",
        publicationYear = 1979,
        publishing = "Editora B"
    ),
    Book(
        title = "O Cortiço",
        author = "Aluísio Azevedo",
        publicationYear = 1890,
        publishing = "Editora B"
    )
)

fun testListBook() {

    val listFilter = listBook.filter { it.title.startsWith("M") }
        .sortedBy { it.publicationYear }
        .map { it.publicationYear }

    listBook.printBook()
    println(listFilter)

    listBookNull.printBook()

    listBook.groupBy { it.publishing ?: "Editora desconhecida" }
        .forEach { (publishing: String?, books: List<Book>) ->
            println("$publishing: ${books.joinToString { it.title }}")
        }
}


