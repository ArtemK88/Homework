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



    }
}
