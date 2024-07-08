package oop.abstraction;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        shape1.draw(); // Outputs: Drawing a circle

        Shape shape2 = new Rectangle();
        shape2.draw(); // Outputs: Drawing a rectangle
    }
}

    /*

    Advantages of Abstraction:

    1. Simplifies Complex Systems: The user of the Shape class only needs to know about the draw() method,
       not the details of how each shape is drawn.

    2. Improves Code Maintainability: Changing the implementation of how a shape is drawn does not affect
       the code that uses the Shape class.

    3. Enhances Reusability: The Shape class and its subclasses can be reused in different parts of the application.

    4. Supports Polymorphism: The Shape reference can point to any subclass object, and the appropriate draw() method
       is called at runtime.

    5. Improves Testability: Tests can be written against the Shape interface, allowing for easy substitution
       of different shape implementations in tests.

    */