package org.example.Library;

public class App {
    public static void main(String[] args) {
        Aggregator aggregator = new Aggregator().generateBook();
        System.out.println(aggregator.toString());
    }
}
