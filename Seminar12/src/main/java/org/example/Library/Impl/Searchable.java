package org.example.Library.Impl;

import org.example.Library.Book;

import java.util.List;

public interface Searchable {
    List<Book> searchByTitle(String title);
    List<Book> searchByAuthor(String author);

}
