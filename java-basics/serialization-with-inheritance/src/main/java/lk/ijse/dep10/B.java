package lk.ijse.dep10;

public class B extends A{
    public int b;

    public B(int a, int b) {
        super(a);
        this.b = b;
        System.out.println("B(a,b)");
    }



    @Override
    public String toString() {
        return "B{" +
                "b=" + b +
                '}';
    }
}
