public class Apple {
    public void eat() {
        System.out.println(Thread.currentThread().getName()+ " is waiting to get the monitor/intrinsic lock");
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " just acquires the monitor/intrinsic lock");
            try {
                System.out.println(Thread.currentThread().getName() + " just release the monitor/intrinsic lock");
                System.out.println(Thread.currentThread().getName()+ " is waiting to get the monitor/intrinsic lock");
                wait();

                System.out.println(Thread.currentThread().getName() + " just acquires the monitor/intrinsic lock");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " is going to release the monitor/intrinsic lock");
        }
    }
    public void cut() {
        System.out.println(Thread.currentThread().getName()+ " is waiting to get the monitor/intrinsic lock");
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " just acquires the monitor/intrinsic lock");
            try {
                System.out.println(Thread.currentThread().getName() + " just release the monitor/intrinsic lock");
                Thread.sleep(5000);
                notify();
                System.out.println(Thread.currentThread().getName()+ " is waiting to get the monitor/intrinsic lock");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
