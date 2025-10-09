package Model;

public class Rectangle extends Shape implements Drawable {
    private final double width;
    private final double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle: " + width + "x" + height);
    }

    @Override
    public String toString() {
        return "Rectangle: color = " + getShapeColor() +
                ", width = " + width +
                ", height = " + height +
                ", area = " + calcArea();
    }
}

