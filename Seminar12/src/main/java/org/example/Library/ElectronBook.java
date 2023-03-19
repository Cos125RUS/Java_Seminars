package org.example.Library;

import java.time.Year;

public class ElectronBook extends Book{
    String type;
    int size;

    public ElectronBook(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public ElectronBook(String title, String author, int pages, int publication, String type, int size) {
        super(title, author, pages, publication);
        this.type = type;
        this.size = size;
    }

    public ElectronBook() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
