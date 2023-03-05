package org.example.Human;

public class Car implements Transport{
    @Override
    public void start() {
        System.out.println("Машина поехала");
    }

    @Override
    public void stop() {
        System.out.println("Догнал трамвай");
    }
}
