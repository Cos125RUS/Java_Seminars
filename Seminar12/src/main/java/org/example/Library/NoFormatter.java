package org.example.Library;

import org.example.Library.Impl.Formatter;

import java.util.List;

public class NoFormatter implements Formatter {
    @Override
    public String format(List<ElectronBook> bookList) {
        return "No Format " + bookList.toString();
    }
}
