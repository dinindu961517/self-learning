public class Demo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

//Default way
//        obj1.show();
//        obj2.show();


        C obj3 = new C();
        D obj4 = new D();
//        System.out.println(obj3.getPriority());
//        System.out.println(obj4.getPriority());
//
//        obj4.setPriority(Thread.MAX_PRIORITY);
//        obj4.setPriority(10);
//        obj3.setPriority(2);
//        obj3.start();
//        obj4.start();

        E obj5 = new E();
        F obj6 = new F();

        Thread t1 = new Thread(obj5);
        Thread t2 = new Thread(obj6);

        t1.start();
        t2.start();
        System.out.println(Thread.currentThread());

    }
}
