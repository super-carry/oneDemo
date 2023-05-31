package learning.eightChapter.singleton.main;

public class Dog {
    public static String info = "hahaha";

    {
        System.out.println("非静态代码块");
    }
    static {
        System.out.println("静态代码块");
    }

    public static void main(String[] args) {
        System.out.println(Dog.info);
        System.out.println(Dog.info);
    }
}
