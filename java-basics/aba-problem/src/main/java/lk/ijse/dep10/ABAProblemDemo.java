package lk.ijse.dep10;

import java.util.concurrent.atomic.AtomicInteger;

public class ABAProblemDemo {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger(0);

        // Initial value: 0
        int initial = counter.get();

        // Thread 1 increments the counter to 1 and then back to 0
        Thread thread1 = new Thread(() -> {
            counter.incrementAndGet(); // Increment to 1
            counter.decrementAndGet(); // Decrement back to 0
        });

        // Thread 2 checks if the counter has changed from the initial value
        Thread thread2 = new Thread(() -> {
            if (counter.compareAndSet(initial, 2)) {
                System.out.println("Thread 2: Value has changed.");
            } else {
                System.out.println("Thread 2: Value has NOT changed.");
            }
        });

        thread1.start();
        thread2.start();
    }
}
