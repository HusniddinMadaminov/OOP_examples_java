package solid.ocp;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(100.0);

        InvoicePrinter plainTextPrinter = new PlainTextInvoicePrinter();
        plainTextPrinter.printInvoice(invoice);

        InvoicePrinter jsonPrinter = new JsonInvoicePrinter();
        jsonPrinter.printInvoice(invoice);
    }
}
