import java.util.ArrayList;

public class PrintVowels {
    public static void main(String[] args) {
        System.out.println(stringContainsVowels("Dinindu"));
    }

    public static ArrayList<Character> stringContainsVowels(String input) {
        char[] inputArray = input.toLowerCase().toCharArray();
        char[] vowelArray = new char[]{'a', 'e', 'i', 'o', 'u'};
        ArrayList<Character> outputArray = new ArrayList<>();
        for (char c : inputArray) {
            for (char c1 : vowelArray) {
                if (c==c1) outputArray.add(c);
            }
        }
        return outputArray;
    }
}
