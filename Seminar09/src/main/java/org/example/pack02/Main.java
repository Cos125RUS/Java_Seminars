package org.example.pack02;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = Fruit.APPLE;

        switch (fruit){
            case PEAR -> {
                System.out.println("Груша");
            }
            case APPLE -> {
                System.out.println("Яблоко");
            }
            case BANANA -> {
                System.out.println("Банан");
            }
            case ORANGE -> {
                System.out.println("Апельсин");
            }
            case PINEAPPLE -> {
                System.out.println("Ананас");
            }
        }
    }
}