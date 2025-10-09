package Model;

public class Triangle extends Shape {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(String shapeColor, double sideA, double sideB, double sideC) {
        super(shapeColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calcArea() {
        double halfPerimeter = (sideA + sideB + sideC);
        return Math.sqrt(halfPerimeter*(halfPerimeter - sideA)*(halfPerimeter - sideB)*(halfPerimeter - sideC));
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle: "+ "(" + sideA + "," + sideB + "," + sideC + ")");
    }

    @Override
    public String toString() {
        return "Triangle: color = " + getShapeColor() +
                ", sideA = " + sideA +
                ", sideB = " + sideB +
                ", sideC = " + sideC +
                ", area = " + calcArea();
    }
}