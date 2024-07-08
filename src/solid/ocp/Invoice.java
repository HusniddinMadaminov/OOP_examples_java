package solid.ocp;

class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

class InvoicePrinterBad {
    public void printInvoice(Invoice invoice) {
        System.out.println("Invoice amount: " + invoice.getAmount());
    }
}

/*
    The Open-Closed Principle (OCP) is another one of the SOLID principles of object-oriented design.
    It states that software entities (classes, modules, functions, etc.) should be open for extension but closed for
    modification. In other words, the behavior of a module can be extended without modifying its source code.

    Now, if we need to add a new feature, such as printing the invoice in a different format (e.g., JSON),
    we would need to modify the InvoicePrinter class. This violates the OCP because the class is not closed for modification.

 */