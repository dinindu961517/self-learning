public class SwapNumbers {
    public static void main(String[] args) {
        swapNumbers(10,20);

    }

    public static void swapNumbers(int a, int b) {
        System.out.println("a is " + a + " and b is " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Now a is " + a + " and b is " + b);
    }
}
