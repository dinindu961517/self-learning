import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

public class Worker implements Runnable{

    String name;
    ReentrantLock lock;

    public Worker(ReentrantLock lock,String name) {
        this.name = name;
        this.lock = lock;
    }
    @Override
    public void run() {
        boolean done=false;
        while (!done) {
            boolean answer = lock.tryLock();

            if (answer) {
                try {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("task name - " + name + " outer lock acquired at " +
                            ft.format(d)+" Doing outer work");
                    Thread.sleep(1500);
                    System.out.println("Lock Hold Count - "+ lock.getHoldCount());
                    lock.lock();
                    try
                    {
                        d = new Date();
                        ft = new SimpleDateFormat("hh:mm:ss");
                        System.out.println("task name - "+ name
                                + " inner lock acquired at "
                                + ft.format(d)
                                + " Doing inner work");
                        System.out.println("Lock Hold Count - "+ lock.getHoldCount());
                        Thread.sleep(1500);
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    finally
                    {
                        //Inner lock release
                        System.out.println("task name - " + name +
                                " releasing inner lock");

                        lock.unlock();
                    }
                    System.out.println("Lock Hold Count - " + lock.getHoldCount());
                    System.out.println("task name - " + name + " work done");

                    done = true;
                } catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    //Outer lock release
                    System.out.println("task name - " + name +
                            " releasing outer lock");

                    lock.unlock();
                    System.out.println("Lock Hold Count - " +
                            lock.getHoldCount());
                }
            }
            else
            {
                System.out.println("task name - " + name +
                        " waiting for lock");
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
