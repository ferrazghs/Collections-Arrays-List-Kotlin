package br.com.alura.list.model

data class Book(
    val title: String,
    val author: String,
    val publicationYear: Long,
    val publishing: String? = null
) {

}