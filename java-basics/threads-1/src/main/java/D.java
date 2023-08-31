public class D extends Thread {

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
