package lk.ijse.dep10;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("example.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        D obj1 = new D(10,20,30,40);
        oos.writeObject(obj1);
        System.out.println("Serialization object: "+obj1);


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("example.txt"));

        D obj2 = (D) ois.readObject();
        System.out.println("Deserialization object: "+obj2);
        System.out.println(obj2.c+obj2.b+obj2.a);
    }
}
