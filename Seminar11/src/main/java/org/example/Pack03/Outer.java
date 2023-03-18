package org.example.Pack03;

public class Outer {
    public static void main(String[] args) {
        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("fly");
            }
        };
        System.out.println(flyable);

        Animal animal = new Animal() {
            @Override
            void run() {

            }

            @Override
            void swim() {

            }
        };

        System.out.println(animal);
    }
}
