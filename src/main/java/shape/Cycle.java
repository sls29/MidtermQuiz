package shape;

public class Cycle extends Shape {
    private double radius;
    public Cycle(String name, double radius){
        super(name);
        this.radius = radius;
    }
    public double getPerimeter(){
        return 2 * 3.1415 *radius;
    }
    public double getArea (){
        return 3.1415 * radius *radius;
    }
}
