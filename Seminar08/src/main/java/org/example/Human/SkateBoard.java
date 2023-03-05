package org.example.Human;

public class SkateBoard implements Transport{
    @Override
    public void start() {
        System.out.println("Скейт покатил");
    }

    @Override
    public void stop() {
        System.out.println("Остановился мордой в асфальт");
    }
}
