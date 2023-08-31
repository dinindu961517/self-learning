import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {
    public static void main(String[] args) {

        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        SharedResource sharedResource = new SharedResource();

        Runnable reader= () -> {
            System.out.println(Thread.currentThread().getName()+" Reading Thread "+ " is going to get the lock");
            readWriteLock.readLock().lock();
            System.out.println(Thread.currentThread().getName()+" Reading Thread "+ " has acquired the lock");
            try {
                sharedResource.read();
            }finally {
                System.out.println(Thread.currentThread().getName()+" Reading Thread "+" has released the lock");
                readWriteLock.readLock().unlock();
            }
        };

        Runnable writer= () -> {
            System.out.println(Thread.currentThread().getName()+" Writing Thread "+ " is going to get the lock");
            readWriteLock.writeLock().lock();
            System.out.println(Thread.currentThread().getName()+" Writing Thread "+ " has acquired the lock");

            try {
                sharedResource.write();
            }finally {
                System.out.println(Thread.currentThread().getName()+ " Writing Thread "+" has released the lock");
                readWriteLock.writeLock().unlock();
            }
        };

        for (int i = 0; i < 5; i++) {
            new Thread(reader).start();
        }
        try {
            Thread.sleep(7500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 5; i++) {
            new Thread(writer).start();
        }
    }
}
