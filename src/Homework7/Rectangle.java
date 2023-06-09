package Homework7;

public class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(Color color, double length, double width ){
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    @Override
    public void paint() {
        System.out.println("Rectangle : " + getColor());
    }
}
