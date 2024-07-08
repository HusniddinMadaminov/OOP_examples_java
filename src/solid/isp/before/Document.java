package solid.isp.before;// Bad design: Monolithic interface

// Interface for a document with edit and print functionalities
public interface Document {
    void edit();
    void print();
    void format(); // Additional functionality related to formatting
}

/*

    Interface Segregation Principle (ISP) states that clients should not be forced to depend on interfaces they do not use.
    In Java, this principle encourages us to create small, cohesive interfaces that are specific to the needs of the clients
    that use them, rather than having large, monolithic interfaces that cater to a wide range of functionalities.

 */