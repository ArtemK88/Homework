package Homework7;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    public Triangle(Color color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    public double calculateArea() {
        double semiPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
    @Override
    public void paint() {
        System.out.println("Triangle : " + getColor());
    }
}
