//1. Створити клас User, у якого будуть:
//
//        - поля userName, age, email, password, isActive(boolean), amountSpentMoney. password та age повинні мати модифікатор доступу private.
//        Зробити геттери і сеттери з валідацією для private полів(валідація довільна).
//
//        - методи: makePurchase, який приймає параметр purchasePrice(вартість покупки) типу double,
//        і виводить на яку суму була здійснена покупка та додає цю вартість до глобальної змінної amountSpentMoney.
//
//        printTotalAmountOfSpentMoney, який виводить загальну суму витрачених грошей.

public class User {
    public String userName;
    private int age;
    public String email;
    private String password;
    public boolean isActive;
    public double amountSpendMoney;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
        System.out.println("Перший конструктор " + userName);
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        System.out.println("Другий констртуктор " + userName + ", " + password);
    }

    public void setPassword(String password) {
        if (password.isEmpty()) {
            System.out.println("Пароль не може бути пустим");
        } else {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setAge(int age) {
        if (age <= 18) {
            System.out.println("Вік не може бути менше 18 років");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void makePurchase(double purchasePrice) {
        amountSpendMoney = purchasePrice + amountSpendMoney;
        System.out.println("Сума покупки " + purchasePrice);
    }

    public void printTotalAmountOfSpentMoney() {
        System.out.println("Загальна сума витрачених грошей " + amountSpendMoney );
    }
    public void addDiscount(int percent) {
        System.out.println("Знижка - " + amountSpendMoney * percent / 100);
    }
}