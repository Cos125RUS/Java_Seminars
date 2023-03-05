package org.example;

public class Tiger extends Cat{

    static int tigerCount;

    public Tiger(int maxSwimDistance, String name) {
        super(maxSwimDistance, "Тигр", name);
        tigerCount++;
    }
}
