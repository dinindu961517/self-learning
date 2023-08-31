package lk.ijse.dep10;

import java.io.ObjectStreamClass;

public class Main {
    private static long serialVersionUID = ObjectStreamClass.lookup(SerialVersionUIDExample.class).getSerialVersionUID();
    public static void main(String[] args) {
        SerialVersionUIDExample obj1 = new SerialVersionUIDExample();
        System.out.println(serialVersionUID);

    }
}
