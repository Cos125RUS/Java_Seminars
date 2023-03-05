package org.example;

public class HomeCat extends Cat{
    static int homecatCount;
    public HomeCat(String name) {
        super(0, "Домашний кот", name);
        homecatCount++;
    }
}
