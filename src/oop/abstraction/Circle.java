package oop.abstraction;

// Concrete class
class Circle extends Shape implements Area {

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void square() {
        System.out.println("Area of circle");
    }

}