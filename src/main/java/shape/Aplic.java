package shape;

import java.util.LinkedList;
import java.util.TreeSet;

public   class Aplic {
    Double sumOfPerimeters = (double) 0;
    Double sumOfAries = (double) 0;
    public Aplic(){

    }
    LinkedList<Shape> Shapes = new LinkedList<>();


    public void ShapeAddRectangle(String name, double length, double width){
        if (CheckForDuplicates(name)) {
            Shapes.add(new Rectangle(name, length, width));
            System.out.println("Rectangle added");
        }
    }
    public void ShapeAddCircle(String name, double radius){
        if(CheckForDuplicates(name)) {
            Shapes.add(new Circle(name, radius));
            System.out.println("Circle added");
        }
    }
    public void ShapeAddTriangle(String name, double side){
        if(CheckForDuplicates(name)) {
            Shapes.add(new EquiteralTriangle(name, side));
            System.out.println("Triangle added");
        }
    }
    public void ShapeAddSquare(String name, double side) {
        if(CheckForDuplicates(name)) {
            Shapes.add(new Square(name, side));
            System.out.println("Square added");
        }
    }
    public void ShapesInfo(){
        System.out.println(Shapes.size());
        System.out.println(Shapes);
    }
    public void SumCalculation() {
        for (Shape nextShape : Shapes) {
            sumOfAries += nextShape.getArea();
            sumOfPerimeters += nextShape.getPerimeter();
        }
        System.out.println("Total area = " + sumOfAries);
        System.out.println("Total perimeter = " + sumOfPerimeters);
    }
    public boolean CheckForDuplicates(String name) {
        int length = name.length();
        for (Shape nextShape : Shapes) {
            if (!name.equals(nextShape.toString().substring(0, length))) {
                System.out.println("Shape already exist");
                return true;
            } else {
                return false;
            }
        }
    return true;
    }


}
