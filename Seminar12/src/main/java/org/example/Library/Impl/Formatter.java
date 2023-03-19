package org.example.Library.Impl;

import org.example.Library.Book;
import org.example.Library.ElectronBook;

import java.util.List;

public interface Formatter {
    String format(List<ElectronBook> bookList);
}
