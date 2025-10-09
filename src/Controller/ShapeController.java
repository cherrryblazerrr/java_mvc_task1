package Controller;
import Model.*;

import java.util.Arrays;
import java.util.List;

public class ShapeController {
    private final List<Shape> shapes;

    public ShapeController() {
        Shape[] shapesArray = new Shape[10];

        shapesArray[0] = new Rectangle("Red", 5.0, 4.0);
        shapesArray[1] = new Rectangle("Blue",3.0, 7.0);
        shapesArray[2] = new Circle("Green",5.0);
        shapesArray[3] = new Circle("Yellow",3.0);
        shapesArray[4] = new Triangle("Purple",3.0, 4.0, 5.0);
        shapesArray[5] = new Triangle("Orange",5.0, 12.0, 13.0);
        shapesArray[6] = new Rectangle("Pink",6.0, 8.0);
        shapesArray[7] = new Circle("Brown",7.0);
        shapesArray[8] = new Triangle("Cyan",6.0, 8.0, 10.0);
        shapesArray[9] = new Rectangle("Magenta",2.0, 9.0);

        this.shapes = Arrays.asList(shapesArray);
    }

    public List<Shape> getAllShapes() {
        return shapes;
    }

    public double calculateTotalArea() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calcArea();
        }
        return totalArea;
    }

    public double calculateAreaByType(String type) {
        double total = 0;
        for (Shape shape : shapes) {
            if (shape.getClass().getSimpleName().equalsIgnoreCase(type)) {
                total += shape.calcArea();
            }
        }
        return total;
    }
    public void sortByArea() {
        shapes.sort(new AreaComparator());
    }
    public void sortByColor() {
        shapes.sort(new ColorComparator());
    }
}
