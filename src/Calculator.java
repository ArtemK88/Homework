//Створити класс Calculator, який буде мати статичні методи для базових арифметичних обчислень.
// В классі Main, викликати методи классу Calculator, для перевірки


public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if(b==0){
            System.out.println("На нуль ділити не можна");
        }
        return a / b;
    }
}