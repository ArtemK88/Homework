package Homework7Calc;

public class ProgrammableCalculator extends Calculator {
    public String[] operations;
    int count;

    public ProgrammableCalculator() {
        operations = new String[100];
        count = 0;
    }

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
        if (b == 0) {
            System.out.println("На нуль ділити не можна");
        }
        return a / b;
    }

    public void removeLastOperation() {
        if (count > 0) {
            count--;
        }
    }
}