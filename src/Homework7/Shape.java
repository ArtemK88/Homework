package Homework7;

import java.util.Objects;

public class Shape {
    public String color;

    public Shape(String color){
        this.color =color;
    }
    public double calculateArea() {
        return 0;
    }
    public double calculatePerimeter(){
        return 0;
    }
    public void paint(){
        System.out.println(color);
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Shape shape = (Shape) obj;
        return Objects.equals(color, shape.color);
    }
    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
    @Override
    public String toString() {
        return "Shape " + "color = " + color;
    }
}
    class ShapeMain{
        public static void main(String[] args) {
            Shape[] shapes = new Shape[3];
            shapes[0] = new Circle("Red", 1.5);
            shapes[1] = new Rectangle("Blue", 4.0, 6.0);
            shapes[2] = new Triangle("Green", 3.0, 4.0, 5.0);

            for (Shape shape : shapes) {
                shape.paint();
                System.out.println("Area: " + shape.calculateArea());
                System.out.println("Perimeter: " + shape.calculatePerimeter());
                System.out.println();
                shapes.equals(shape);

            }
            Shape shape1 = new Circle("Red", 5.0);
            Shape shape2 = new Circle("Black", 2.0);
            System.out.println("Shape1 equals Shape2: " + shape1.equals(shape2));
            System.out.println(shape2.toString());
            System.out.println(shape1.hashCode());
        }
    }