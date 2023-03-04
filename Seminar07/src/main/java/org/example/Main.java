package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsic", "Black", 3);
//        System.out.println(cat.getName() + " " + cat.getColor() + " " + cat.getAge());
//        Cat cat2 = new Cat();
//        System.out.println(cat2.getName() + " " + cat2.getColor() + " " + cat2.getAge());
//        cat2.setName("Pushok");
//        cat2.setColor("Blue");
//        cat2.setAge(-2);
//        System.out.println(cat2.getName() + " " + cat2.getColor() + " " + cat2.getAge());
        cat.voice();
        cat.jump();
        cat.animalInfo();
        System.out.println(cat instanceof Cat);

//        Point3D point1 = new Point3D(2,3,4);
//        System.out.println("Len = " + point1.lengthVector());
//        Point3D point2 = new Point3D(3,4,5);
//        System.out.println("Scol = " + point1.scolor(point2));
//        System.out.println("Multy: " + point1.multy(point2).x+ ", "
//                + point1.multy(point2).y + ", " + point1.multy(point2).z);
//        System.out.println("Triangle = " + point1.cosTriangle(point2));
//        System.out.println("Sum : " + point1.multy(point2).x+ ", "
//                + point1.multy(point2).y + ", " + point1.multy(point2).z);
//        System.out.println("Dif : " + point1.multy(point2).x+ ", "
//                + point1.multy(point2).y + ", " + point1.multy(point2).z);


    }

}