package oop.polymorphism;

class Cow implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}