public class Demo {
    public static void main(String[] args) {
        Runnable obj1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread t1 = new Thread(obj1);
        t1.start();
    }
}
