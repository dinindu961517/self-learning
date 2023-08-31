import java.util.Arrays;

public class ArrayReverse2 {

    public static int[] reverseArray(int[] inputArray) {
        int start = 0;
        int end = inputArray.length-1;

        while (start < end) {
            int temp = inputArray[start];
            inputArray[start] = inputArray[end];
            inputArray[end] = temp;
            start++;
            end--;

        }
        return inputArray;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 5, 6, 9, 8, 52};
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(reverseArray(input)));
    }
}
