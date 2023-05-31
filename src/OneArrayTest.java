public class OneArrayTest {
    public static void main(String[] args) {
        int num1 = 10;
        // 静态初始化
        double[] prices;
        prices = new double[]{20, 32, 51, 22};

//        String[] foods;
//        foods = new String[]{"aa", "bb", "cc"};
        // 动态初始化
        String[] foods = new String[4];
        int arr[] = new int[4];
        int[] arr1 = {1,2,3,4};
        double arr2[] = {1,2,3};
        System.out.println(arr2.length);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
