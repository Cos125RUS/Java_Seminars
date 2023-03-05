package org.example;

public abstract class Animal {

    protected int maxRunDistance;
    protected int maxSwimDistance;
    protected String type;
    protected String name;
    protected static int count;

//    public Animal() {
//    }

//    public Animal(String name) {
//        this.name = name;
//    }

    public Animal(int maxRunDistance, int maxSwimDistance, String type, String name) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.type = type;
        this.name = name;
        count++;
    }

//    public void animalInfo() {
//        System.out.println("Имя животного : " + name);
//    }
//
//    abstract void voice();
//
//    public void jump() {
//        System.out.println(" Прыжок ! ");
//    }

    public void run(int distance) {
        if (distance > maxRunDistance)
            System.out.println("Сдурел? " + name + " столько не пробежит!");
        else System.out.println(name + " Промчал");
    }

    public void swim(int distance) {
        if (maxSwimDistance > 0) {
            if (distance > maxSwimDistance)
                System.out.println(name + " не черепаха");
            else System.out.println(name  + " Проплыл");
        } else System.out.println(name + " Не умеет плавать");
    }


}
