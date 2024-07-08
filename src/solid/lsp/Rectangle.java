package solid.lsp;

// Rectangle class (subclass of Shape)
public class Rectangle extends Shape {

    private int width;
    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    // Constructor, getters, setters
    // Other rectangle-specific methods
}