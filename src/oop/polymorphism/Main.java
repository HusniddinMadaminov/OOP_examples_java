package oop.polymorphism;

public class Main {
    public static void main(String[] args) {

        // Method overriding
        // Array of different Animal objects
        Animal[] animals = { new Dog(), new Cat(), new Cow() };

        // Polymorphic method call
        for (Animal animal : animals) {
            animal.makeSound(); // Outputs: Woof, Meow, Moo
        }

        //Method overloading
        MathOperations mathOps = new MathOperations();

        System.out.println(mathOps.add(5, 3));       // Outputs: 8
        System.out.println(mathOps.add(5, 3, 2));    // Outputs: 10
        System.out.println(mathOps.add(5.5, 3.2));   // Outputs: 8.7
    }
}

/*

    Advantages of Polymorphism:

    1. Code Reusability: The makeSound method is defined in the Animal interface and reused by all implementing classes
       (Dog, Cat, Cow).

    2. Flexibility and Scalability: New animal types can be added easily by implementing the Animal interface without
       modifying existing code.

    3. Simplifies Code: Polymorphism eliminates the need for complex conditional statements to determine the type of
       animal and call the appropriate makeSound method.

 */