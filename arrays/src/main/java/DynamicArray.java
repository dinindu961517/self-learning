import java.util.Arrays;

public class DynamicArray {
    public static int[] add(int[] array, int input) {
        int[] returnArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            returnArray[i] = array[i];
        }
        returnArray[array.length] = input;
        return returnArray;

    }

    public static void main(String[] args) {
        int[] myArray1 = new int[]{1, 2, 3, 4};
        myArray1 = add(myArray1, 25);
        System.out.println(Arrays.toString(myArray1));
    }
}
