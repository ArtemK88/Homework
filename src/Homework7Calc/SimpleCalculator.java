package Homework7Calc;

public class SimpleCalculator extends Calculator{
    @Override
    public double add(double a, double b) {
        return a + b;
    }
    @Override
    public double subtract(double a, double b) {
        return a - b;
    }
    @Override
    public double multiply(double a, double b) {
        return a * b;
    }
    @Override
    public double divide(double a, double b) {
        if(b==0){
            System.out.println("На нуль ділити не можна");
        }
        return a / b;
    }
}
