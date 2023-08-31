public class Main {
    public static void main(String[] args) {
        HelloClass obj1 = new HelloClass();
        HiClass obj2 = new HiClass();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
