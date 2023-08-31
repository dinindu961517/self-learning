public class Demo1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Thread t1= new Thread(()->{
            try {
                vehicle.drive();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }


        });
        Thread t2= new Thread(()->{
            try {
                vehicle.drive();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }


        });

        t1.start();
        t2.start();
        System.out.println(Thread.currentThread());



    }
}
