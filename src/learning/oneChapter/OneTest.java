package learning.oneChapter;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OneTest {
    public static void main(String[] args) {
        int[][] arr1 = new int[4][];
        arr1[0] = new int[4];
        arr1[0][0] = 1;
//      java.lang.NullPointerException
        arr1[1] = new int[5];
        arr1[1][4] = 5;
        System.out.println(arr1[0][0]);
        System.out.println(arr1[1][4]);
        int[] arr2 = {1,2,3,4};
        System.out.println(Arrays.toString(arr2));
        Arrays.fill(arr2, 10);
        System.out.println(Arrays.toString(arr2));
        int index = Arrays.binarySearch(arr2, 10);
        System.out.println(index);
        int[][] arr3 = new int[3][];
        System.out.println(arr3);
    }

}
