package Homework7Calc;

public class AccountingCalculator extends Calculator{

    public double calculateProfitMargin(double revenue, double expenses) {
        return (revenue - expenses) / revenue * 100;
    }
}
