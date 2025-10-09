package Model;

public abstract class Shape implements Drawable {
    private final String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {return shapeColor;}

    public abstract double calcArea();

    @Override
    public String toString() {
        return "Shape color=" + getShapeColor() + "]";
    }

}
