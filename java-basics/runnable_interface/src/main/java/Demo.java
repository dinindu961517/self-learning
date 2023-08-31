public class Demo {
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

//        thread1.start();
//        thread2.start();

        Thread thread3= new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hey");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        thread3.start();
    }
}
