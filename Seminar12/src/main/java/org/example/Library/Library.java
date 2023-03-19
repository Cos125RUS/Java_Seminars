package org.example.Library;

import org.example.Library.Impl.Genre;
import org.example.Library.Impl.Searchable;

import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable {
    private List<Book> booksList;
    @Override
    public List<Book> searchByTitle(String title) {
        List<Book> selection = new ArrayList<>();
        for (Book book: booksList)
            if (book.getTitle().equals(title))
                selection.add(book);
        return selection;
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        List<Book> selection = new ArrayList<>();
        for (Book book: booksList)
            if (book.getTitle().equals(author))
                selection.add(book);
        return selection;
    }

    public void addBook(Book book){
        booksList.add(book);
    }
}
