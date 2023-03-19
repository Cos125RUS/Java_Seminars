package org.example.Library;

import org.example.Library.Impl.BookCard;

public class Aggregator implements BookCard {
    static int count = 0;
    Book book;
    BookGenre bookGenre;

    public Aggregator(Book book, BookGenre bookGenre) {
        this.book = book;
        this.bookGenre = bookGenre;
    }

    public Aggregator() {
    }

    @Override
    public Aggregator generateBook() {
        return new Aggregator(new Book(++count + "_book", "Author", 94, 1986),
                new BookGenre());
    }

    @Override
    public String toString() {
        return "Aggregator{" +
                "book=" + book +
                ", bookGenre=" + bookGenre +
                '}';
    }
}
