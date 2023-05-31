package learning.sixChapter.exer4;

import java.sql.SQLOutput;

public class test {
    private int a;
    private int b;
    test(){

    }

    test(int a){
        this.a = 5;
    }

    test(int a, int b){
        this(a);
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public static void main(String[] args) {
        test t = new test(1, 2);
        System.out.println(t.getA());
    }
}
