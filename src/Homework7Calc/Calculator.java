package Homework7Calc;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(int a, int b) {
//        if(b==0){
//            System.out.println("На нуль ділити не можна");
//        }
        try {
            return a / b;
        }catch (ArithmeticException e)  {
            System.out.println("На нуль ділити не можна");
        }return 0;
    }
}

        class CalculatorTest {
            public static void main(String[] args) {
                SimpleCalculator simpleCalculator = new SimpleCalculator();
                System.out.println("Simple Calculator:");
                System.out.println("Addition: " + simpleCalculator.add(10, 5));
                System.out.println("Subtraction: " + simpleCalculator.subtract(10, 5));
                System.out.println("Multiplication: " + simpleCalculator.multiply(10, 5));
                System.out.println("Division: " + simpleCalculator.divide(10, 10));
                  System.out.println();

                FinancialCalculator financialCalculator = new FinancialCalculator();
                System.out.println();
                System.out.println("FinancialCalculator");
                System.out.println("Interest: " + financialCalculator.calculateInterest(100, 1.5, 5));

                AccountingCalculator accountingCalculator = new AccountingCalculator();
                System.out.println();
                System.out.println("AccountingCalculator");
                System.out.println("Profit Margin: " + accountingCalculator.calculateProfitMargin(500, 10));

                EngineeringCalculator engineeringCalculator = new EngineeringCalculator();
                System.out.println();
                System.out.println("EngineeringCalculator");
                System.out.println("Square: " + engineeringCalculator.calculateSquareRoot(-64));

                ProgrammableCalculator programmableCalculator = new ProgrammableCalculator();
                System.out.println();
                System.out.println("ProgrammableCalculator");
                programmableCalculator.removeLastOperation();
            }
        }
