package Homework7;

import java.util.Objects;

import static java.awt.Color.red;

abstract class Shape {
    private Color color;

    public Shape(Color color){
        this.color =color;
    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract void paint();
    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor(){
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
            shapes[0] = new Circle(Color.RED, 1.5);
            shapes[1] = new Rectangle(Color.BLUE, 4.0, 6.0);
            shapes[2] = new Triangle(Color.GREEN, 3.0, 4.0, 5.0);

            for (Shape shape : shapes) {
                shape.paint();
                System.out.println("Area: " + shape.calculateArea());
                System.out.println("Perimeter: " + shape.calculatePerimeter());
                System.out.println();
                shapes.equals(shape);


            }
            Shape shape1 = new Circle(Color.GREEN, 5.0);
            Shape shape2 = new Circle(Color.BLUE, 2.0);
            System.out.println("Shape1 equals Shape2: " + shape1.equals(shape2));
            System.out.println(shape2.toString());
            System.out.println(shape1.hashCode());
        }
    }