package shape;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class App {
    public static void main( String[] args ) {

    Aplic aplic = new Aplic();

    aplic.ShapeAddRectangle("rectangle", 3, 5);
    aplic.ShapeAddRectangle("rectangle", 3, 4);
    aplic.ShapeAddSquare("square", 4);
    aplic.ShapeAddTriangle("triangle", 6);
    aplic.ShapeAddTriangle("triangle", 3);
    aplic.ShapeAddCircle("circle", 7);

    aplic.ShapesInfo();
    aplic.SumCalculation();
    }
}
