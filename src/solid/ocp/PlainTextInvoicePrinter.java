package solid.ocp;

class PlainTextInvoicePrinter implements InvoicePrinter {
    @Override
    public void printInvoice(Invoice invoice) {
        System.out.println("Invoice amount: " + invoice.getAmount());
    }
}
