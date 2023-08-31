public class DeadLockExample {
    static Object resource1 = new Object();
    static Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1 : Holding resource 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 1 : Waiting to capture the resource 2");
                synchronized (resource2) {
                    System.out.println("Thread 1 : Acquires the resource 1");
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2 : Holding resource 2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 2 : Waiting to capture the resource 1");
                synchronized (resource1) {
                    System.out.println("Thread 2 : Acquires the resource 1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
