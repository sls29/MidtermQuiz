package shape;

public class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(String name, double base, double height){
        super(name);
        this.base = base;
        this.height = height;
    }
    public double getPerimeter(){
        System.out.println("For Triangle is not that easy");
        return 0;

    }
    public double getArea(){
        return 0.5 * base * height;
    }
}
