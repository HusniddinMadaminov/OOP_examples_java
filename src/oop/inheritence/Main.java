package oop.inheritence;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        animal.eat();
    }
}

    /*

    Advantages of Inheritance:

    1. Code reusability:  Common code can be written in the superclass and reused in the subclasses.
    2. Method overriding:  Subclasses can provide specific implementations for methods that are more appropriate to their behavior.

    */

