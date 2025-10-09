import Controller.ShapeController;
import View.ShapeView;
import Model.Shape;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShapeController controller = new ShapeController();
        ShapeView view = new ShapeView();

        List<Shape> shapes = controller.getAllShapes();

        view.displayShapes(shapes);
        view.displayDrawing(shapes);

        double totalArea = controller.calculateTotalArea();
        view.displayTotalArea(totalArea);

        view.displayAreaByType("Rectangle", controller.calculateAreaByType("Rectangle"));
        view.displayAreaByType("Circle", controller.calculateAreaByType("Circle"));
        view.displayAreaByType("Triangle", controller.calculateAreaByType("Triangle"));

        controller.sortByArea();
        view.displaySortedByArea(controller.getAllShapes());

        controller.sortByColor();
        view.displaySortedByColor(controller.getAllShapes());
    }
}
