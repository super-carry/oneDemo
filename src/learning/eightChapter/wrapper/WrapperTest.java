package learning.eightChapter.wrapper;

import org.junit.jupiter.api.Test;

public class WrapperTest {
    @Test
    public void test1(){
        int i1 = 10;
        Integer ii1 = new Integer(i1);
        System.out.println(ii1.toString());

        Float ff1 = new Float(12.3f);
        System.out.println(ff1.toString());
    }

    @Test
    public void test2(){
        Integer i1 = Integer.valueOf(12);

        Boolean b1 = Boolean.valueOf(true);

        boolean b = b1.booleanValue();
        System.out.println(b);
    }
}
