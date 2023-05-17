public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.userName = "Artem";
        user1.email = "K@.com";
        user1.amountSpendMoney = 1000;
        user1.isActive = true;
        user1.makePurchase(666.33);
        user1.setAge(-17);
        user1.setPassword("");
        user1.printTotalAmountOfSpentMoney();
        user1.addDiscount(1);

        double result1 = Calculator.add(8.32, 10.5);
        System.out.println("Результат додавання: " + result1);

        double result2 = Calculator.subtract(4, 2);
        System.out.println("Результат віднімання: " + result2);

        double result3 = Calculator.multiply(6, 2);
        System.out.println("Результат множення: " + result3);

        double result4 = Calculator.divide(10.5, 0);
        System.out.println("Результат ділення: " + result4);


    }
}
