package Homework7Calc;

public class FinancialCalculator extends Calculator{

    public double calculateInterest ( double principal, double rate, double time){
        return principal * rate * time;
}
}