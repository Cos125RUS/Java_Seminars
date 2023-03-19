package org.example.Library;

import org.example.Library.Impl.Formatter;

import java.util.List;

public class HTMLFormatter implements Formatter {
    @Override
    public String format(List<ElectronBook> bookList) {
        return "HTML Format " + bookList.toString();
    }
}
