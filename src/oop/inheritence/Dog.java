package oop.inheritence;

public class Dog extends Animal {

    void bark() {
        System.out.println("The dog barks");
    }

    @Override
    public void eat() {
        System.out.println("The dog eats meat");
    }

    public void eat(int a) {
        System.out.println("The dog eats meat");
    }
}
