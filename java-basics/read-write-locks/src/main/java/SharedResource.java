public class SharedResource {
    private int value;

    public void read() {
        System.out.println(Thread.currentThread().getName() + "-Reading value:" + value);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void write() {
        value++;
        System.out.println(Thread.currentThread().getName() + "-Writing value:" + value);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
