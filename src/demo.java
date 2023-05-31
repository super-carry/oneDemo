import java.util.Random;
import java.util.Scanner;

public class demo {
    public static void print(){
        System.out.println("hhh");
        // 1.2的字面量是double类型，不能由高转向低 byte+short->int
        float a = (float) 1.2;
        System.out.println(0.1+0.2);
    }
    public static void main(String[] args) {
//        System.out.println("helloworld");
//        System.out.println(123+1);
//        System.out.println("hellow"+"sdf");
//        System.out.println("hellow"+'s');
//        demo.print();
//        Scanner scan = new Scanner(System.in);
//        String name = scan.next();
//        int age = scan.nextInt();
//        double weight = scan.nextDouble();
//        boolean isSingle = scan.nextBoolean();
//        // 取scan后的首个字符
//        char gender = scan.next().charAt(0);
//        System.out.println(name+age+weight);
//        scan.close();
        int d1 = (int)(Math.random()*100)%10;
        System.out.println(d1);
        System.out.println("name");
    }

}
class ScannerTest{
    public static void main(String[] args) {
        System.out.println(1);
    }
    void main1(){
        System.out.println(1);
    }
}
