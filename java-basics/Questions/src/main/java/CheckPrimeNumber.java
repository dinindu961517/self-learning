public class CheckPrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(23));
    }

    public static boolean isPrime(int input) {
        if (input==1) return false;
        if (input==2) return true;
        for (int i = 2; i <= (input+1)/2; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
