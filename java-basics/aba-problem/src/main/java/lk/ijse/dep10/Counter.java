package lk.ijse.dep10;

public class Counter {
    int count;

    public void actions() {
        synchronized (this){
            for (int i = 0; i < 20; i++) {
                this.notify();
                count++;
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            for (int i = 20; i >0 ; i--) {
                this.notify();
                count--;
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

    public void printCount() {
        synchronized (this) {
            this.notify();
            System.out.println(count);
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
