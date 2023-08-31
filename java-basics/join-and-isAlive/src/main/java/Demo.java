import java.sql.SQLOutput;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1= new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hi");

            }
        });
        Thread t2= new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hello");

            }
        });
        t1.start();

        t2.start();
        System.out.println(t1.isAlive());
        t1.join();
        t2.join();
        System.out.println(t2.isAlive());
        System.out.println("Bye Byee");

        System.out.println("Byee");

        String[] firstName = {"Dinindu","Prabhashwar","Lokugamgae"};
        String lastName = "Lokugamage";

        System.out.println(String.join(",",firstName));
    }
}
