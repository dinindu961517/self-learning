import java.util.ArrayList;
import java.util.Arrays;

public class MultiDimentionalArrays {
    public static void main(String[] args) {
        int[][] myArray1 = new int[3][2];

        myArray1[0][0] = 1;
        myArray1[0][1] = 2;
//        myArray1[1][0] = 3;
//        myArray1[1][1] = 4;
//        myArray1[2][0] = 5;



        System.out.println(Arrays.toString(myArray1[0]));
        System.out.println(Arrays.toString(myArray1[1]));
        System.out.println(Arrays.toString(myArray1[2]));

        int[][][] myArray2 = new int[4][3][2];

        int[] myArray3 = new int[3];
        System.out.println(myArray3);
        myArray3[2] = 23;
        System.out.println(myArray3);



    }

}
