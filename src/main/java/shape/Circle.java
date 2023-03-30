package shape;

public class Circle extends Shape {
    private double radius;

    final private double piNumber = 3.141529;
    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }
    public String toString(){
        return super.toString() + radius;
    }
    public double getPerimeter(){
        return 2 * piNumber * radius;
    }
    public double getArea (){
        return piNumber * radius *radius;
    }
}
