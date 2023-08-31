import java.util.ArrayList;

public class FindFactorials {
    public static void main(String[] args) {
        System.out.println(findFactorials(21));

    }

    public static ArrayList<Integer> findFactorials(int input) {
        ArrayList<Integer> factorials = new ArrayList<>();
        for (int i = 1; i <= input; i++) {
            if (input%i==0) factorials.add(i);
        }
        return factorials;

    }
}
