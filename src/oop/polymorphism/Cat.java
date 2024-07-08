package oop.polymorphism;

//Method overriding(Runtime Polymorphism)
//Method overriding is called runtime polymorphism because the decision about which overridden method
//to call is made at runtime, rather than at compile time.

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}