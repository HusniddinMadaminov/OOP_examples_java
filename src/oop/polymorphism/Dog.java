package oop.polymorphism;

// Concrete classes implementing the interface
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}