package org.example;

public class Dog extends Animal{
    static int dogCount;
    public Dog(String name) {
        super(500, 10, "Собака", name);
        dogCount++;
    }
//    private String color;
//    private int age;
//
//    public Dog(String name, String color, int age) {
//        super.name = name;
//        this.color = color;
//        this.age = age;
//    }
//
//    public Dog() {
//    }
//
//    @Override
//    public void voice() {
//        System.out.println(" гавк ! гавк!");
//    }
}
