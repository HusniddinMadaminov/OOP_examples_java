package oop.polymorphism;


//Method overloading (Compile time Polymorphism)
//Method overloading is called compile-time polymorphism because the decision about
//which overloaded method to call is made at compile time, rather than at runtime.

class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}