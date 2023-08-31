public class LiveLockExample {
    static boolean shouldRetry = true;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (shouldRetry) {
                System.out.println("Thread 1: Waiting for the condition to change");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Thread 1: Done");
        }); Thread thread2 = new Thread(() -> {
            while (shouldRetry) {
                System.out.println("Thread 2: Waiting for the condition to change");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Thread 2: Done");
        });

        thread1.start();
        thread2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        shouldRetry = false; // Change the condition

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            
        }

    }
}
