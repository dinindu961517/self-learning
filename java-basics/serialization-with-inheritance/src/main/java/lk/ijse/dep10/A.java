package lk.ijse.dep10;

public class A {
    public int a;
    public A(int a) {
        this.a = a;
        System.out.println("A(a)");
    }

    public A() {
        System.out.println("A()");
    }

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                '}';
    }
}
