package lk.ijse.dep10;

public class ABAProblemSolution {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1=new Thread(() -> {
            counter.actions();
        });

        Thread t2 =new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                counter.printCount();
            }
        });

        t1.start();
        t2.start();
    }
}
