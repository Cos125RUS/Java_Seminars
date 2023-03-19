package org.example.Storage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println(new Order(new ArrayList<>(Arrays.asList(new Product(),new Product()))));
    }
}
