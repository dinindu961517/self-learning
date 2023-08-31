public class Demo {
    public static void main(String[] args) {
        HI obj = new HI();
        Hello obj1 = new Hello();

//        obj.start();
//        obj1.start();



        Runnable t1= new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Runnable t2=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        /* We can not do that, since we can start only threads
        t1.start();
        t2.start();
        */

        Thread t11 = new Thread(t1);
        Thread t22 = new Thread(t2);
        t11.start();
        t22.start();

    }
}
