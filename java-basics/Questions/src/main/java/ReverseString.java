public class ReverseString {
    public static void main(String[] args) {
        reverseString1("Hi How are You?");
        System.out.println("");
        System.out.println(reverseString2("Chethini"));
    }

    public static void reverseString1(String input) {
        char[] inputArray = input.toCharArray();
        char[] reverseString = new char[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            reverseString[i] = inputArray[inputArray.length - 1 - i];
        }
        for (int i = 0; i < reverseString.length; i++) {
            System.out.print(reverseString[i]);
        }
    }

    public static String reverseString2(String input) {
        if (input==null) throw new IllegalArgumentException("Please Enter a String");
        StringBuilder sb = new StringBuilder();

        char[] inputArray = input.toCharArray();

        for (int i = 0; i < inputArray.length; i++) {
            sb.append(inputArray[inputArray.length-1-i]);
        }
        return sb.toString();
    }
}
