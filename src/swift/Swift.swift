
// S - Single Responsibility Principle(SRP)
//   •    Definition: A class should have only one reason to change, meaning it should have only one job or responsibility.
//   •    Example: If you have a class Invoice, it should only handle invoice-related operations. Generating a PDF of the invoice should be handled by a different class, say InvoicePDFGenerator.
class Report {
    func generate() {
        // logic to generate report
    }
}

class ReportPrinter {
    func print(report: Report) {
        // logic to print report
    }
}

//O - Open Closed Principal(OCP)
//    •  Definition: Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
//    •  Example: If you have a Shape class with a method area(), instead of modifying the Shape class to support new shapes, you can extend it by creating new subclasses like Circle and Rectangle.
protocol Shape {
    func area() -> Double
}

class Circle: Shape {
    var radius: Double

    init(radius: Double) {
        self.radius = radius
    }

    func area() -> Double {
        return Double.pi * radius * radius
    }
}

class Rectangle: Shape {
    var width: Double
    var height: Double

    init(width: Double, height: Double) {
        self.width = width
        self.height = height
    }

    func area() -> Double {
        return width * height
    }
}

//L - Liskov Substitution Principle (LSP)
//•    Definition: Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.
//•    Example: If Bird is a superclass and Penguin is a subclass, methods that use Bird should work correctly if they use Penguin instead, as long as Penguin behaves like a Bird.
func printArea(of shape: Shape) {
    print("Area: \(shape.area())")
}

let circle = Circle(radius: 5)
let rectangle = Rectangle(width: 10, height: 5)

printArea(of: circle)    // Works correctly
printArea(of: rectangle) // Works correctly

// I - Interface(Protocol) Segregation Principle (ISP)
//    •    Definition: No client should be forced to depend on methods it does not use. It’s better to have multiple small interfaces than one large, general-purpose interface.
//    •    Example: Instead of having a large interface Animal with methods eat(), sleep(), and fly(), it’s better to have separate interfaces like Eater, Sleeper, and Flyer. Then a Bird class can implement all three interfaces, while a Dog class only implements Eater and Sleeper.
protocol Printer {
    func printDocument()
}

protocol Scanner {
    func scanDocument()
}

//protocol Device {
//    func printDocument()
//    func scanDocument()
//}

class MultiFunctionPrinter: Printer, Scanner {
    func printDocument() {
        // logic to print document
    }

    func scanDocument() {
        // logic to scan document
    }
}

class SimplePrinter: Printer {

    func printDocument() {
        // logic to print document
    }
}

// D - Dependency Inversion Principle (DIP)
//   •    Definition: High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.
//   •    Example: Instead of a LightBulb class directly depending on a Switch class, both can depend on an abstraction like Switchable, which allows different types of light bulbs and switches to be used interchangeably.
protocol Switchable {
    func turnOn()
    func turnOff()
}

class LightBulb: Switchable {
    func turnOn() {
        print("LightBulb turned on")
    }

    func turnOff() {
        print("LightBulb turned off")
    }
}

class Cooler: Switchable {
    func turnOn() {
        print("Cooler turned on")
    }

    func turnOff() {
        print("Cooler turned off")
    }

}

class Switch {
    let device: Switchable

    init(device: Switchable) {
        self.device = device
    }

    func operate() {
        device.turnOn()
        device.turnOff()
    }
}

let bulb = LightBulb()
let lightSwitch = Switch(device: bulb)
lightSwitch.operate()

let cooler = Cooler()
let coolerSwitch = Switch(device: cooler)
coolerSwitch.operate()
