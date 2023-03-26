package shape;

public class Square extends Shape {
   private double side;
    public Square(String name,double side) {
        super(name);
        this.side = side;
    }
    public double getPerimeter(){
        return 4 * side;
    }
    public double getArea(){
        return side * side;
    }
}
