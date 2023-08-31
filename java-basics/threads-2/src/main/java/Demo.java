public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        System.out.println(counter.count);
        Runnable obj1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
//                    System.out.println(counter.count+" 1");
                }
            }
        };

        Runnable obj2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
//                    System.out.println(counter.count+" 2");
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
//
        t1.join();
        t2.join();



        System.out.println(counter.count);

    }
}
