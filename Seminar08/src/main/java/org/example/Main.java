package org.example;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("qwe", "asd", 21);
        //па полям
//        cat.name = "Тиша";
//        cat.color = "Black";
//        cat.age = 21;
        //инкапсулировали
//        cat.setName("Тиша");
//        cat.setColor("Black");
//        cat.setAge(31);
//        System.out.println("cat = " + cat);
//        cat.jump();
//        cat.voice();
//        cat.animalInfo();
//        Dog dog = new Dog();
//        dog.voice();

//        Animal animal = new Cat();
//        Cat cat2 = new Animal(); // Error
//        animal.voice();
//        System.out.println(animal.getClass());

//        Animal[] catsAndDogs = {
//                new Cat("Пушёк", "Белый", 5),
//                new Dog ("Палкан", "Серый", 7)
//        };
//        for (Animal a: catsAndDogs){
//            a.voice();
//        }
//        Animal cat2 = new Cat("Барсик", "Серый", 2);
//        if (cat2 instanceof Cat)
//            ((Cat) cat2).clew();
//        else System.out.println("Не кот");

        Animal[] animals = {
                new Dog("Бобик"),
                new Dog("Рекс"),
                new HomeCat("Снежок"),
                new Tiger(50, "Шерхан")
        };

        for (Animal a: animals){
            a.run(150);
            a.swim(11);
        }

        System.out.println();
        System.out.println("Кошек: " + Cat.catCount);
        System.out.println("Животных: " + Animal.count);
    }

}