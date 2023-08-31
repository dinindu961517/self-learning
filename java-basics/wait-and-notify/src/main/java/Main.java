public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Thread thread1 = new Thread(() -> {
            apple.eat();

        });Thread thread2 = new Thread(() -> {
            apple.cut();

        });

        thread1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }
}
