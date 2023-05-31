package learning.eightChapter._interface;

public class jdk8 {
    public static void main(String[] args) {
        test.method1();
        test2 t = new test2();
        t.method2();
    }
}

interface test{
    public static void method1(){
        System.out.println("static method");
    };

    public default void method2(){
        System.out.println("default method");
    };

    public void method3();
}

class test2 implements test{

    @Override
    public void method2() {
        test.super.method2();
    }

    @Override
    public void method3() {
        System.out.println("method3");
    }
}
