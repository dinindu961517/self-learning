import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Vehicle {
    ReentrantLock lock = new ReentrantLock();
    int counter;


    public void drive() {

        System.out.println(Thread.currentThread().getName() + " is waiting to acquire the lock");

        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " has acquired the lock");
            counter++;
            System.out.println(Thread.currentThread().getName() + " " + lock.isLocked());
            System.out.println(Thread.currentThread().getName() + " " + lock.getHoldCount());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + " has released the lock");
            lock.unlock();
        }


    }

    public void horn() {

        System.out.println(Thread.currentThread().getName() + " is waited for the lock");
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " has acquired the lock");
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {

            System.out.println(Thread.currentThread().getName() + " has released the thread");
            lock.unlock();
        }
    }

    public void breaks() throws InterruptedException {
        String threadName = Thread.currentThread().getName();

        while (true) {
            System.out.println(Thread.currentThread().getName()+ " is waiting for the lock");
            if (lock.tryLock(1000,TimeUnit.MILLISECONDS)) {
                try {
                    System.out.println(threadName + " has acquired the lock");
                    System.out.println(lock.getHoldCount());
                    Thread.sleep(2000); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println(threadName + " has released the lock");
                    lock.unlock();
                    return;
                }
            }

        }

    }

}
