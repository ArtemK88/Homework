package Homework7Calc;

public class ProgrammableCalculator extends Calculator {
    public String[] operations;
    int count;

    public ProgrammableCalculator() {
        operations = new String[100];
        count = 0;
    }

    public void removeLastOperation() {
        if (count > 0) {
            count--;
        }
    }
}