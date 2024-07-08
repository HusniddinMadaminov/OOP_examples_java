package solid.ocp;

class JsonInvoicePrinter implements InvoicePrinter {
    @Override
    public void printInvoice(Invoice invoice) {
        System.out.println("{ \"invoice_amount\": " + invoice.getAmount() + " }");
    }
}
