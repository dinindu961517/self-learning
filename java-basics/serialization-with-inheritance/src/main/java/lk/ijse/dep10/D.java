package lk.ijse.dep10;

import java.io.Serializable;

public class D extends C implements Serializable {
    public int d=40;

    public D(int a,int b, int c, int d) {
        super(a, b, c);
        this.d = d;
        System.out.println("D(a,b,c,d)");
    }

    public D() {
        System.out.println("D()");
    }

    @Override
    public String toString() {
        return "D{" +
                "d=" + d +
                '}';
    }
}
