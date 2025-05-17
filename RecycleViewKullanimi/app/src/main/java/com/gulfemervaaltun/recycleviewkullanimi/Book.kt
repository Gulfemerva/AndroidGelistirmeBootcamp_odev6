package com.gulfemervaaltun.recycleviewkullanimi

var bookList= mutableListOf<Book>()

val BOOK_ID_EXTRA = "bookExtra"

data class Book(
    var cover: Int,
    var author: String,
    var title: String,
    var description: String,
    var id: Int = bookList.size
)
