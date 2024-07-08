package solid.ocp;

interface InvoicePrinter {
    void printInvoice(Invoice invoice);
}

/*

    To adhere to the Open-Closed Principle, we can use polymorphism and abstraction.
    We create an interface for printing invoices and implement different formats without modifying the existing code.

 */