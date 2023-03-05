package org.example.Human;

public class Rollers implements Transport {
    @Override
    public void start() {
        System.out.println("Катись на роликах");
    }

    @Override
    public void stop() {
        System.out.println("Провалился в люк");
    }
}
