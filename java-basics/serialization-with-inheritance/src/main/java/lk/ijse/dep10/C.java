package lk.ijse.dep10;

import java.io.Serializable;
import java.util.Set;

public class C extends B  {
    public int c;

    public C(int a,int b, int c) {
        super(a, b);
        this.c = c;
        System.out.println("C(a,b,c)");
    }

    public C() {
        super(10,20);
        System.out.println("C()");
    }

    @Override
    public String toString() {
        return "C{" +
                "c=" + c +
                '}';
    }
}
