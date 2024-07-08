package solid.isp.after;

// Client class that only needs print functionality
public class Printer {
    public void printDocument(Printable printable) {
        printable.print();
    }
}