package solid.lsp;

public class GraphicsApp {

    public void drawShape(Shape shape) {
        shape.draw(); // This should work for any shape
    }
    
    public static void main(String[] args) {
        GraphicsApp app = new GraphicsApp();
        
        // Create a rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(100);
        rectangle.setHeight(50);
        
        // Create a square
        Square square = new Square();
        square.setSide(75);
        
        // Drawing a rectangle
        app.drawShape(rectangle); // Should work
        
        // Drawing a square
        app.drawShape(square); // Should also work, as Square is a subclass of Rectangle
    }
}
