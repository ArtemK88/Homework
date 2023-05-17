//Створити додатковий клас для перевірки функціональності класса User, де треба створити декілька екземплярів класса User з різними значеннями,
//        повикликати методи, в кінці програми вивести суму витрачених грошей, кожного юзера та інформацію про нього
public class Users {
    public static void main(String[] args) {
        User user2 = new User("aa", "bb");
        User user3 = new User();

//        user2.userName = "Petro";
        user2.email = "P@.com";
        user2.amountSpendMoney = 99;
        user2.isActive = false;
 //       user2.setPassword("12345678");
        user2.setAge(50);
        user2.makePurchase(69.99);
        user3.userName = "Dima";
        user3.email = "D@.com";
        user3.amountSpendMoney = 156;
        user3.isActive = true;
        user3.setAge(-18);
        user3.setPassword("");
        user3.makePurchase(100.22);
        System.out.println("Інформація про юзерів:");
        System.out.println("Юзер 2:" + user2);
        System.out.println("Ім'я: " + user2.userName);
        System.out.println("Вік: " + user2.getAge());
        System.out.println("Email: " + user2.email);
        System.out.println("Password: " + user2.getPassword());
        System.out.println("Активний: " + user2.isActive);
        user2.printTotalAmountOfSpentMoney();
        System.out.println();
        System.out.println("Юзер 3:" + user3);
        System.out.println("Ім'я: " + user3.userName);
        System.out.println("Вік: " + user3.getAge());
        System.out.println("Email: " + user3.email);
        System.out.println("Password: " + user3.getPassword());
        System.out.println("Активний: " + user3.isActive);
        user3.printTotalAmountOfSpentMoney();
    }
}
