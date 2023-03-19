package org.example.Library;

import org.example.Library.Impl.Genre;

public class BookGenre implements Genre {
    private String bookGenre;

    public BookGenre() {
        this.bookGenre = "Fantasy";
    }

    public BookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    @Override
    public String getGenre() {
        return bookGenre;
    }

    @Override
    public String toString() {
        return "BookGenre{" +
                "bookGenre='" + bookGenre + '\'' +
                '}';
    }
}
