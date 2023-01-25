package br.com.alura.list.test

import br.com.alura.list.model.Book

fun List<Book?>.printBook() {
    val printList = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        " - Livro ${it.title} de ${it.author}"
    }
    println("\n ### Lista de Livros ### \n$printList")
}