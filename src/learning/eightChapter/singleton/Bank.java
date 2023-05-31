package learning.eightChapter.singleton;

// 饿汉式
public class Bank {
    private int salary;

    private Bank(int salary){
        this.salary = salary;
    }

    private static Bank bank = new Bank(50);

    public static Bank returnBank(int salary){
        return bank;
    }

}
