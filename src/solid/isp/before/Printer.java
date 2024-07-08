package solid.isp.before;

// Client class that only needs print functionality
public class Printer {
    public void printDocument(Document document) {
        document.print();
    }
}