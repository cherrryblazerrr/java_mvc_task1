package Model;

public class Circle extends Shape {
    private final double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;

    }

    @Override
    public double calcArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle: " + "r = " + radius);
    }

    @Override
    public String toString() {
        return "Circle: color = " + getShapeColor() +
                ", radius = " + radius +
                ", area = " + calcArea();
    }
}
