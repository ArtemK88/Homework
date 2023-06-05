package Homework7Calc;

public class EngineeringCalculator extends Calculator {

    public double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число повинно бути невід'ємним.");
        }return Math.sqrt(number);
    }
}