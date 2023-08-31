import java.util.Arrays;

public class ArrayReverse {
    public static int[] reverseArray(int[] inputArray) {
        int[] reversedArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            reversedArray[i] = inputArray[inputArray.length - i-1];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 5, 6, 9, 8, 52};
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(reverseArray(input)));
    }

}
