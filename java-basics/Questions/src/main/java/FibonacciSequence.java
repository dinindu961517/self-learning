public class FibonacciSequence {
    public static void main(String[] args) {
        fibonacciSequence(100);
    }

    public static void fibonacciSequence(int limit) {
        int first = 0;
        int second = 1;
        int sum = first+second;
        System.out.print(0+",");
        System.out.print(1+",");
        while (sum < limit) {
            System.out.print(sum+",");
            first = second;
            second = sum;
            sum = first+second;
        }

    }
}
