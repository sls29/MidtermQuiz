package shape;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class App
{
    public static void main( String[] args )
    {

    List <Shape> Shapes = new LinkedList<>();

    Shapes.add( new Rectangle("rectangle1", 3, 5));
    Shapes.add( new Square("square1", 4));
    Shapes.add( new Triangle("triangle1", 4, 6));
    Shapes.add( new Cycle("cycle1", 7));

    for (Shape nextShape : Shapes) {
        System.out.println(" ");
        System.out.println( "Area: " + nextShape.getArea() + " and Perimeter: " + nextShape.getPerimeter());
        System.out.println(" ");
    }



    }
}
