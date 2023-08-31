public class Demo {
    public static void main(String[] args) {
        Counter counter = new Counter();


//        for (int i = 0; i < 10; i++) {
//            counter.increment();
//            System.out.println("Count:"+counter.count);
//        }


        Thread t1= new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("t1");
                }
            }
        };

        t1.start();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Runnable");
                }

            }
        };

        Thread t2 = new Thread(r1);
        t2.start();

        Thread t3= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        });
        t3.start();

        Thread t4=new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi new");

            }
            System.out.println(Thread.currentThread());
        });
        t4.run();
        System.out.println(Thread.currentThread());
    }
}
