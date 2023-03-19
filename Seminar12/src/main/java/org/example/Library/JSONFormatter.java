package org.example.Library;

import org.example.Library.Book;
import org.example.Library.Impl.Formatter;

import java.util.List;

public class JSONFormatter implements Formatter {
    @Override
    public String format(List<ElectronBook> bookList) {
        return "JSON Format " + bookList.toString();
    }
}
