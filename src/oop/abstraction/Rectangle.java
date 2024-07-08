package oop.abstraction;

// Another concrete class
class Rectangle extends Circle implements Area, Areas {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public void square() {
        System.out.println("Area of rectangle");
    }

}
