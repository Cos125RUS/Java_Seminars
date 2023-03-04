package org.example;

import lombok.Builder;

//@Builder
public class Cat extends Animal{
    private String color;
    private int age;

    public Cat(String name, String color, int age) {
        super.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat() {
        this.name = "CatName";
        this.color = "CatColor";
        this.age = 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 30)
            this.age = age;
        else System.out.println("Введён неверный возраст");;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void animalInfo() {
        System.out.println("This is Cat\nName: " + name + "\nColor: " + color + "\nAge: " + age);
    }

    @Override
    public void voice() {
        System.out.println("Myu!");
    }

    @Override
    public void jump() {
        System.out.println("Shmyk!");
    }
}
