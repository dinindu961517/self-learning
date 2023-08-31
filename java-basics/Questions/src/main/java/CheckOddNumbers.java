import java.util.ArrayList;

public class CheckOddNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(6);
        list1.add(10);
        System.out.println(containsOddNumbers(list1));

    }

    public static boolean containsOddNumbers(ArrayList<Integer> inputList) {
        for (Integer integer : inputList) {
            if (integer%2==1) return true;
        }
        return false;
    }
}
