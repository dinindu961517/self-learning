public class C extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
