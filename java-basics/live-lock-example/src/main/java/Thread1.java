public class Thread1 extends Thread {
    private Object resource;

    public Thread1(Object resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (resource) {
                System.out.println(Thread.currentThread().getName()+ " acquires the resource");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+ " releases the resource");
                resource.notify();
            }

            synchronized (this) {
                System.out.println(Thread.currentThread().getName()+ " acquires the its thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    System.out.println(Thread.currentThread().getName()+ " waits ");
//                    this.wait();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
