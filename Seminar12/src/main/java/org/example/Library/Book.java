package org.example.Library;

import java.time.LocalDate;
import java.time.Year;

public class Book {
    private int id;
    private String title;
    private String author;
    private int pages;
    private int publication;
    private static int count = 0;

    public Book() {
        id = ++count;
    }

    public Book(String title, String author, int pages, int publication) {
        this();
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.publication = publication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPublication() {
        return publication;
    }

    public void setPublication(int publication) {
        this.publication = publication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", publication=" + publication +
                '}';
    }
}
