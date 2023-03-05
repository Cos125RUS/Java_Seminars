package org.example.Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Bicycle bicycle = new Bicycle();
        Rollers rollers = new Rollers();
        human.drive(bicycle);
        human.stop();
        human.drive(rollers);
        human.drive(new Car());
        Transport transport = new SkateBoard();
        human.stop();
        human.drive(transport);
    }
}

