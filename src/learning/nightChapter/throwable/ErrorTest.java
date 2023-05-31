package learning.nightChapter.throwable;

import jdk.internal.org.objectweb.asm.tree.FieldInsnNode;
import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorTest {
    public static void main(String[] args) {
//        byte[] b = new byte[1024*1024*1000];
        ErrorTest errorTest = new ErrorTest();
        errorTest.test();

    }

    @Test
    public void test(){
        try{
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("异常处理完成");
        }
    }
}
