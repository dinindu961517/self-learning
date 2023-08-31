public class LiveLockExample2 {
    public static void main(String[] args) {
        Object resource = new Object();

        Thread thread1 = new Thread1(resource);
        Thread thread2 = new Thread1(resource);

        thread1.start();
        thread2.start();
    }
}
