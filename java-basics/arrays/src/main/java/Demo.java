import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int x = 10;
        Integer y = 10;
        System.out.println(Integer.max(10, 5));
        System.out.println(Integer.toOctalString(y));

        int[] myArray1 = new int[5];
        int myArray2[] = new int[5];
        int[] myArray3 = {1, 2, 3, 4, 5, 6};
        int myArray4[] = {1, 2, 3, 4, 5, 6};
        int[] myArray5 = new int[]{1, 2, 3, 4, 5};

        System.out.println(myArray1.length);
        System.out.println(Arrays.toString(myArray1));
        myArray1[0] = 23;
        myArray1[1] = 56;
        myArray1[2] = 45;
        System.out.println(Arrays.toString(myArray1));





    }
}
