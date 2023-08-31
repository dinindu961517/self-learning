public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(524425));
    }

    public static boolean isPalindrome(int input) {
        char[] inputArray = Integer.toString(input).toCharArray();
        int start = 0;
        int end = inputArray.length - 1;
        while (start < end) {
            if (!(inputArray[start]==inputArray[end])) return false;
            start++;
            end--;
        }
        return true;
    }

}
