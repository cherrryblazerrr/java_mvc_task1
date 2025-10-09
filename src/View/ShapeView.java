package View;

import Model.Shape;
import java.util.List;

public class ShapeView {

    public void displayShapes(List<Shape> shapes) {
        System.out.println("---Масив фігур---");
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println((i + 1) + ". " + shapes.get(i));
        }
        System.out.println();
    }

    public void displayDrawing(List<Shape> shapes) {
        System.out.println("---Промальовані фігури---");
        for (Shape shape : shapes) {
            shape.draw();
        }
        System.out.println();
    }

    public void displayTotalArea(double area) {
        System.out.printf("---Загальна площа всіх 10 фігур---\n%.2f\n\n", area);
    }

    public void displayAreaByType(String type, double area) {
        System.out.printf("---Площа %s ---\n%.2f\n\n", type.toLowerCase(), area);
    }

    public void displaySortedByArea(List<Shape> shapes) {
        System.out.println("---Відсортовані фігури за площею---");
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() +
                    " (" + shape.getShapeColor() + "), площа: " + shape.calcArea());
        }
        System.out.println();
    }

    // Метод для цвета — обязательно принимает List<Shape>
    public void displaySortedByColor(List<Shape> shapes) {
        System.out.println("---Відсортовані фігури за кольором---");
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() +
                    " (" + shape.getShapeColor() + "), площа: " + shape.calcArea());
        }
        System.out.println();
    }
}