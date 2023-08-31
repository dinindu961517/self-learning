public class Demo {
    public static void main(String[] args) {
        Thread thread=new Thread(()->{
            for (int i = 0; i <5; i++) {
                System.out.println("Hi");
                System.out.println(Thread.currentThread());
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        },"Hello Thread");

        thread.setName("MyThread");
        thread.setPriority(5);
        thread.setPriority(Thread.MAX_PRIORITY);
        /* Priority is by default is=5, 1 is the lowest and 10 is the highest*/

        thread.start();
        System.out.println(Thread.currentThread());
    }
}
